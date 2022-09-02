package com.questetra.qlang.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import org.antlr.v4.runtime.Token;

import java.util.Stack;

@NodeInfo(shortName = "int")
public class IntegerNode extends NumberNode {
    private Integer value;

    private IntegerNode(Integer value) {
        this.value = value;
    }

    public static IntegerNode of(Token token) {
        return new IntegerNode(Integer.valueOf(token.getText()));
    }

    @Override
    Object executeGeneric(VirtualFrame frame) {
        Stack<Object> stack = (Stack<Object>) frame.getObject(0);
        stack.push(value);
        return null;
    }
}