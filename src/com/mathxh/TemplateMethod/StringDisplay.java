package com.mathxh.TemplateMethod;

public class StringDisplay extends AbstractDisplay {

    private String content;
    private int width;

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; ++i) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public StringDisplay(String content) {
        this.content = content;
        this.width = content.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + content + "|");
    }

    @Override
    public void close() {
        printLine();
    }
}
