package com.mathxh.TemplateMethod;

/*
*
* 工厂方法模式: 将具体处理交给子类，在父类中定义处理流程的框架，在子类中实现具体处理，模板就是骨架，框架的意思。把处理流程抽象出来
* 使逻辑处理通用化
 */


public class Main {
    public static void main(String[] args) {
        AbstractDisplay charDisplay = new CharDisplay('M');
        AbstractDisplay helloWorldDisplay = new StringDisplay("Hello World.");
        AbstractDisplay anotherDisplay = new StringDisplay("I am crush on you.");

        charDisplay.display();
        helloWorldDisplay.display();
        anotherDisplay.display();
    }
}
