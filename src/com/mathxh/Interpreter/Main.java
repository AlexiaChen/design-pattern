package com.mathxh.Interpreter;


/*
* 解释器模式： 语法规则也是类。就是实现一个简单语言的解释器，一般写解释器会用到这样的模式。
*
*  有些框架用脚本语言编写简单逻辑的时候就不需要修改宿主程序的代码了，直接修改脚本语言
*
*/

/*
*   Mini-Language's E-BNF:
*
*   <program> ::= program <command list>
*   <command list> ::= <command>* end
*   <command> ::= <repeat command> | <primitive command>
*   <repeat command> ::= repeat <number> <command list>
*   <primitive command> ::= go | left | right
*
*/

import java.util.ArrayList;

public class Main {

    private static ArrayList<String> lineProgramArray = new ArrayList<>();

    public static void init() {
        lineProgramArray.add("program end");
        lineProgramArray.add("program go end");
        lineProgramArray.add("program go right go right go right go right end");
        lineProgramArray.add("program repeat 4 go right end end");
        lineProgramArray.add("program repeat 4 repeat 3 go right go left end right end end");
    }

    public static void main(String[] args) {
        init();

        lineProgramArray.forEach(line -> {
            System.out.println("code text: " + line);
            ASTNode program = new ProgramNode();
            try {
                program.parse(new Context(line));
            } catch (ParseException e) {
                e.printStackTrace();
            }

            System.out.println("program = " + program.toString());
        });

    }
}
