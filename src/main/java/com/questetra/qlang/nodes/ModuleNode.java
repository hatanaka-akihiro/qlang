package com.questetra.qlang.nodes;

import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.RootNode;

import java.util.List;
import java.util.Map;

public class ModuleNode extends RootNode {
    private Map<String, FunctionNode> functions;

    public ModuleNode(TruffleLanguage<?> language, FrameDescriptor frameDescriptor,
                      Map<String, FunctionNode> functions) {
        super(language, frameDescriptor);
        this.functions = functions;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        return functions.get("$main").executeGeneric(frame);
    }
}