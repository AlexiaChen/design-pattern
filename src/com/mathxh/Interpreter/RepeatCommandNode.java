package com.mathxh.Interpreter;

// <repeat command> ::= repeat <number> <command list>
public class RepeatCommandNode extends ASTNode {
    private int number;
    private ASTNode commandList;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("repeat");
        number = context.currentNumber();
        context.nextToken();
        commandList = new CommandListNode();
        commandList.parse(context);
    }

    public String toString() {
        return "(repeat " + number + " " + commandList.toString() + ")";
    }

    @Override
    public void execute() throws ExecuteException {
        for(int i = 0; i < number; ++i) {
            commandList.execute();
        }
    }
}
