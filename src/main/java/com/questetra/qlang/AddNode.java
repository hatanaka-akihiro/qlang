package com.questetra.qlang;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = "+")
@NodeChild("leftNode")
@NodeChild("rightNoode")
public abstract class AddNode extends MathNode {
    @Specialization
    public long add(long left, long right) {
        return left + right;
    }

    public Object add(Object left, Object right) {
        return null;
    }
}