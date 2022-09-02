package com.questetra.qlang.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@NodeInfo(shortName = "int")
public class FunctionNode extends ExpressionNode {
    private List<ExpressionNode> expressions;

    public FunctionNode(List<ExpressionNode> expressions) {
        this.expressions = expressions;
    }

    public static FunctionNode of(List<ExpressionNode> expressions) {
        return new FunctionNode(expressions);
    }

    @Override
    Object executeGeneric(VirtualFrame frame) {
        Stack<Object> stack = new Stack<>();
        frame.setObject(0, stack);
        for(ExpressionNode expression: expressions){
            expression.executeGeneric(frame);
        }
        return stack.pop();
    }
}