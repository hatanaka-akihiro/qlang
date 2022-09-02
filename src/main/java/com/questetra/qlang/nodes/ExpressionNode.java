package com.questetra.qlang.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;

public abstract class ExpressionNode extends Node {
    abstract Object executeGeneric(VirtualFrame frame);
}
