package com.questetra.qlang.parser;

import com.oracle.truffle.api.source.Source;
import org.antlr.v4.runtime.*;

import java.util.Stack;

public class WATextHelper {
    private static final class BailoutErrorListener extends BaseErrorListener {
        private final Source source;

        BailoutErrorListener(Source source) {
            this.source = source;
        }

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
            throwParseError(source, line, charPositionInLine, (Token) offendingSymbol, msg);
        }
    }

    private static void throwParseError(Source source, int line, int charPositionInLine, Token token, String message) {
        int col = charPositionInLine + 1;
        String location = "-- line " + line + " col " + col + ": ";
        int length = token == null ? 1 : Math.max(token.getStopIndex() - token.getStartIndex(), 0);
        throw new WATextParseError(source, line, col, length, String.format("Error(s) parsing script:%n" + location + message));
    }

    public static WATextParser prepareParser(Source source) {
        WATextLexer lexer = new WATextLexer(CharStreams.fromString(source.getCharacters().toString()));
        WATextParser parser = new WATextParser(new CommonTokenStream(lexer));
        lexer.removeErrorListeners();
        parser.removeErrorListeners();
        BailoutErrorListener listener = new BailoutErrorListener(source);
        lexer.addErrorListener(listener);
        parser.addErrorListener(listener);
        parser.factory = new WANodeFactory();
        parser.source = source;

        return parser;
    }
}