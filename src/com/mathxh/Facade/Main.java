package com.mathxh.Facade;

/*
*  外观模式： 随着程序越来越大，类的关系错综复杂。需要使用该模式为互相关联在一起的类整理出一个高层的API接口（重点是简化API使用，KISS原则）
*  有时候，需要考虑系统内部各类的责任关系和依赖关系，以便正确顺序调用各个类。
*
*
*/

public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("kishi@163.com", "welcome.html");
    }
}
