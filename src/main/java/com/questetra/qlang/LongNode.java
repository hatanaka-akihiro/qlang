package com.questetra.qlang;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = "value")
public class LongNode extends MathNode {
    private long value;

    private LongNode(long value) {
        this.value = value;
    }

    static LongNode of(String v) {
        return new LongNode(Long.parseLong(v.trim()));
    }

    long executeLong(VirtualFrame frame) {
        return value;
    }

    @Override
    Object executeGeneric(VirtualFrame frame) {
        return value;
    }
}
