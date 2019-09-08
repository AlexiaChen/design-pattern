package com.mathxh.Interpreter;

public class InterpreterFacade implements Executor {
    private ExecutorFactory factory;
    private Context context;
    private ASTNode rootNode;

    public InterpreterFacade(ExecutorFactory factory) {
        this.factory = factory;
    }

    public boolean parse(String text) {
        boolean isOk = true;
        this.context = new Context(text);
        this.context.setExecutorFactory(factory);
        this.rootNode = new ProgramNode();

        try {
            rootNode.parse(context);
        } catch (ParseException e) {
            e.printStackTrace();
            isOk = false;
        }
        return isOk;
    }

    @Override
    public void execute() throws ExecuteException {
        rootNode.execute();
    }
}
