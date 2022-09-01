package com.questetra.qlang;

import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.FrameSlotKind;
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
        setup(frame);
        return body.executeGeneric(frame);
    }

    private void setup(VirtualFrame frame) {
        final FrameDescriptor desc = frame.getFrameDescriptor();
        FrameSlot slotAa = desc.findOrAddFrameSlot("aa");
        desc.setFrameSlotKind(slotAa, FrameSlotKind.Long);
        frame.setLong(slotAa, 123);
    }
}