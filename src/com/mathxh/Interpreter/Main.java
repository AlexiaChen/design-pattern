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

public class Main {
    public static void main(String[] args) {

    }
}
