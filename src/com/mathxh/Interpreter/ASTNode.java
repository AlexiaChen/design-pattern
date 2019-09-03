package com.mathxh.Interpreter;

public abstract class ASTNode {
    public abstract void parse(Context context) throws ParseException;
}
