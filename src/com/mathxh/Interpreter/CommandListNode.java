package com.mathxh.Interpreter;

import java.util.ArrayList;

// <command list> ::= <command>* end
public class CommandListNode extends ASTNode {
    private ArrayList<ASTNode> list = new ArrayList<>();

    @Override
    public void parse(Context context) throws ParseException {
        while(true) {
            if(context.getCurrentToken() == null) {
                throw new ParseException("Missing end");
            } else if(context.getCurrentToken().equals("end")) {
                context.skipToken("end");
                break;
            } else {
                ASTNode commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        list.forEach(node -> {
            CommandNode cmdNode = (CommandNode)node;
            s.append(cmdNode.toString() + " ");
        });
        return s.toString();
    }

    @Override
    public void execute() throws ExecuteException {
        for (ASTNode astNode : list) {
            ((CommandNode) astNode).execute();
        }
    }
}
