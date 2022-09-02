grammar WAText;

@parser::header
{
import com.questetra.qlang.nodes.ExpressionNode;
import com.questetra.qlang.nodes.FunctionNode;
import com.oracle.truffle.api.source.Source;
import java.util.ArrayList;
import java.util.Map;
}

@parser::members
{
WANodeFactory factory;
Source source;

public Map<String, FunctionNode> getFunctions() {
  return factory.getFunctions();
}
}

module:
'(module '
  function*
')'
EOF
;

function returns [ExpressionNode node]:
'(func ' name=IDENTIFIER ' '
result
{ List<ExpressionNode> exprs = new ArrayList<>(); }
(
    expr
    { exprs.add($expr.node); }
)+
')'
{ factory.addFunction($name, exprs); }
;

result:
'(result ' TYPE ')'
;


expr returns [ExpressionNode node]
: declare_const
;

declare_const returns [ExpressionNode node]:
TYPE '.const ' num=NUMERIC_LITERAL
{ $node = factory.createInteger($num); }
;

TYPE: 'int32';
LETTER : [A-Z] | [a-z];
NON_ZERO_DIGIT : [1-9];
DIGIT : [0-9];
//TAB : '\t';
//STRING_CHAR : ~('"' | '\r' | '\n');

IDENTIFIER : '$' LETTER (LETTER | DIGIT)*;
//STRING_LITERAL : '"' STRING_CHAR* '"';
NUMERIC_LITERAL : NON_ZERO_DIGIT DIGIT*;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines