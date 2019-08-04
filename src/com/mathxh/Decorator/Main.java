package com.mathxh.Decorator;


/*
*  装饰器模式： 装饰边框与被装饰物的一致性。不断地为对象添加装饰的设计模式
*
*   这里还是以显示框为例子
*
*/

public class Main {
    public static void main(String[] args) {
        Display display1 = new StringDisplay("Hello, World.");
        Display display2 = new SideBorder(display1, '#');
        Display display3 = new FullBorder(display2);

        display1.show();
        display2.show();
        display3.show();

        Display display4 = new SideBorder(display3, '*');
        display4.show();
    }
}
