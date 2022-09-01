package com.questetra.qlang;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.instrumentation.ProvidedTags;
import com.oracle.truffle.api.instrumentation.StandardTags;
import com.oracle.truffle.api.debug.DebuggerTags;
@TruffleLanguage.Registration(name = "MathLang", id = "mathlang",
        defaultMimeType = MathLang.MIME_TYPE, characterMimeTypes = MathLang.MIME_TYPE)
@ProvidedTags({StandardTags.CallTag.class, StandardTags.StatementTag.class,
               StandardTags.RootTag.class, DebuggerTags.AlwaysHalt.class})
public class MathLang extends TruffleLanguage<MathLangContext>{
    public static final String MIME_TYPE = "application/x-mathlang";

    @Override
    protected CallTarget parse(ParsingRequest request) throws Exception {
        String source = request.getSource().getCharacters().toString();
        String[] nums = source.split("\\+");
        FrameDescriptor frame = new FrameDescriptor();

        MathNode node = parseNode(frame, nums[nums.length - 1]);
        for (int i = nums.length - 2; i >= 0; --i) {
            node = AddNodeGen.create(parseNode(frame, nums[i]), node);
        }
        MathRootNode root = new MathRootNode(this, new FrameDescriptor(), node);
        return Truffle.getRuntime().createCallTarget(root);
    }

    MathNode parseNode(FrameDescriptor frame, String value) {
        try {
            return LongNode.of(value);
        } catch (NumberFormatException ex) {
            return VariableNodeGen.create(frame.findOrAddFrameSlot(value));
        }
    }
    @Override
    protected MathLangContext createContext(Env env) {
        return new MathLangContext();
    }
}
