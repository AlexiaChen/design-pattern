package com.mathxh.Interpreter;

// <program> ::= program <command list>
public class ProgramNode extends ASTNode {
    private ASTNode commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    public String toString() {
        return "(program " + commandListNode.toString() + ")";
    }
}
