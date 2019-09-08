package com.mathxh.Interpreter;

// <command> ::= <repeat command> | <primitive command>
public class CommandNode extends ASTNode {
    private ASTNode command;

    @Override
    public void parse(Context context) throws ParseException {
        if(context.getCurrentToken().equals("repeat")) {
            command = new RepeatCommandNode();
            command.parse(context);
        } else {
            command = new PrimitiveCommandNode();
            command.parse(context);
        }
    }

    public String toString() {
        return command.toString();
    }

    @Override
    public void execute() throws ExecuteException {
        command.execute();
    }
}
