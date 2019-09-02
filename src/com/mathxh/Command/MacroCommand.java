package com.mathxh.Command;

import java.util.Stack;

public class MacroCommand implements Command {
    private Stack<Command> commands = new Stack<Command>();

    @Override
    public void execute() {
        commands.forEach(it -> {
            Command cmd = (Command)it;
            cmd.execute();
        });
    }

    public void append(Command cmd) {
        if(cmd != this) {
            commands.push(cmd);
        }
    }

    public void undo() {
        if(!commands.empty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }
}
