package com.questetra.qlang;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.debug.DebuggerTags;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.instrumentation.ProvidedTags;
import com.oracle.truffle.api.instrumentation.StandardTags;
import com.oracle.truffle.api.source.Source;
import com.questetra.qlang.nodes.ModuleNode;
import com.questetra.qlang.parser.WATextHelper;
import com.questetra.qlang.parser.WATextParser;

@TruffleLanguage.Registration(name = "WebAssemblyText", id = "wat",
        defaultMimeType = WATextLang.MIME_TYPE, characterMimeTypes = WATextLang.MIME_TYPE)
@ProvidedTags({StandardTags.CallTag.class, StandardTags.StatementTag.class,
        StandardTags.RootTag.class, DebuggerTags.AlwaysHalt.class})
public class WATextLang extends TruffleLanguage<WATextContext> {
    public static final String MIME_TYPE = "application/wat";

    @Override
    protected CallTarget parse(ParsingRequest request) throws Exception {
        Source source = request.getSource();
        WATextParser parser = WATextHelper.prepareParser(source);
        parser.module();

        FrameDescriptor frame = new FrameDescriptor();
        ModuleNode module = new ModuleNode(this, frame, parser.getFunctions());

        return Truffle.getRuntime().createCallTarget(module);
    }

    @Override
    protected WATextContext createContext(Env env) {
        return new WATextContext();
    }
}
