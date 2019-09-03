package com.mathxh.Interpreter;

// <primitive command> ::= go | left | right
public class PrimitiveCommandNode extends ASTNode {
    private String primitive;

    @Override
    public void parse(Context context) throws ParseException {
        primitive = context.getCurrentToken();
        context.skipToken(primitive);
        if(!primitive.equals("go") && !primitive.equals("left") && !primitive.equals("right")) {
            throw new ParseException(primitive + " is undefined");
        }
    }

    public String toString() {
        return primitive;
    }
}
