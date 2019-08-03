package com.mathxh.Bridge;

public class StringDisplayImpl extends DisplayImpl {
    private String content;
    private int width;

    public StringDisplayImpl(String content) {
        this.content = content;
        this.width = content.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + content + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for(int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
