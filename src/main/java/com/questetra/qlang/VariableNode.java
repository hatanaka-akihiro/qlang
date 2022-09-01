package com.questetra.qlang;

import com.oracle.truffle.api.dsl.NodeField;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.FrameUtil;
import com.oracle.truffle.api.frame.VirtualFrame;

@NodeField(name = "slot", type = FrameSlot.class)
public abstract class VariableNode extends MathNode {
    abstract FrameSlot getSlot();

    @Specialization
    long readLong(VirtualFrame vf) {
        return FrameUtil.getLongSafe(vf, getSlot());
    }
}
