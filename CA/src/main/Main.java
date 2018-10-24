package main;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import parsers.SMOOLALexer;
import parsers.SMOOLAParser;

import java.io.IOException;

// Visit https://stackoverflow.com/questions/26451636/how-do-i-use-antlr-generated-parser-and-lexer
public class Main {
    public static void main(String[] args) throws IOException {
        ANTLRInputStream reader = new ANTLRFileStream(args[1]);

        // Pass #1
        SMOOLALexer pass1Lexer = new SMOOLALexer(reader);
        CommonTokenStream pass1Tokens = new CommonTokenStream(pass1Lexer);
        SMOOLAParser pass1Parser = new SMOOLAParser(pass1Tokens);
        ParseTree pass1Tree = pass1Parser.program(); // Program is starting production rule
        // System.out.println(pass1Tree.toStringTree());

    }
}