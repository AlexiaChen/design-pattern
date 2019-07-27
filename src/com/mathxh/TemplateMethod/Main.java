package com.mathxh.TemplateMethod;

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
