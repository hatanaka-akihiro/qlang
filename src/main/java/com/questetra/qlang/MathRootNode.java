package com.questetra.qlang;

import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.RootNode;

public class MathRootNode extends RootNode {
    private MathNode body;

    public MathRootNode(TruffleLanguage<?> language, FrameDescriptor frameDescriptor,
                        MathNode body) {
        super(language, frameDescriptor);
        this.body = body;
    }

    @Override public Object execute(VirtualFrame frame) {
        return body.executeGeneric(frame);
    }
}