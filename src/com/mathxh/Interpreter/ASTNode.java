package com.mathxh.Interpreter;

public abstract class ASTNode implements Executor {
    public abstract void parse(Context context) throws ParseException;
}
