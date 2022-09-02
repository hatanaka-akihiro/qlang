package com.questetra.qlang.parser;

import com.questetra.qlang.nodes.ExpressionNode;
import com.questetra.qlang.nodes.FunctionNode;
import com.questetra.qlang.nodes.IntegerNode;
import org.antlr.v4.runtime.Token;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WANodeFactory {
    private Map<String, FunctionNode> functions = new HashMap<>();

    IntegerNode createInteger(Token token) {
        return IntegerNode.of(token);
    }

    void addFunction(Token token, List<ExpressionNode> expressions) {
        functions.put(token.getText(), FunctionNode.of(expressions));
    }

    public Map<String, FunctionNode> getFunctions() {
        return functions;
    }
}
