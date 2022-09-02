package com.questetra.qlang.nodes;

import com.oracle.truffle.api.dsl.TypeSystemReference;

@TypeSystemReference(NumberTypes.class)
public abstract class NumberNode extends ExpressionNode {
}
