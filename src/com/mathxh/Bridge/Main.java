package com.mathxh.Bridge;

/*
*
*   桥接模式： 将类的功能层次结构与实现层次结构分离
*
*
*/

public class Main {
    public static void main(String[] args) {
        Display display1 = new Display(new StringDisplayImpl("Hello, China."));
        display1.dispaly();

        Display display2 = new CountDisplay(new StringDisplayImpl("Hello, Hong Kong"));
        display2.dispaly();

        CountDisplay display3 = new CountDisplay(new StringDisplayImpl("Hey, Earth"));
        display3.dispaly();
        display3.multiDisplay(5);
    }
}
