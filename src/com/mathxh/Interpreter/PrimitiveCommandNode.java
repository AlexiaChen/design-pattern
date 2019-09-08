package com.mathxh.Interpreter;

// <primitive command> ::= go | left | right
public class PrimitiveCommandNode extends ASTNode {
    private String primitive;
    private Executor executor;
    @Override
    public void parse(Context context) throws ParseException {
        primitive = context.getCurrentToken();
        context.skipToken(primitive);
        if(!primitive.equals("go") && !primitive.equals("left") && !primitive.equals("right")) {
            throw new ParseException(primitive + " is undefined");
        }
        executor = context.createExecutor(primitive);
    }

    public String toString() {
        return primitive;
    }

    @Override
    public void execute() throws ExecuteException {
        if(executor == null) {
            throw new ExecuteException(primitive + ": is not defined.");
        } else {
            executor.execute();
        }
    }
}
