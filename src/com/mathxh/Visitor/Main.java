package com.mathxh.Visitor;

/*
*  访问者模式： 访问数据结构并处理数据。把数据结构与处理分开，访问者访问数据结构并处理数据结构。
*
*
*/

public class Main {
    public static void main(String[] args) {

        Directory root = new Directory("root");
        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");

        root.add(bin);
        root.add(tmp);
        root.add(usr);

        bin.add(new File("vim", 10000));
        bin.add(new File("latex", 20000));

        usr.add(new File("hello.docx", 5000000));
        usr.add(new File("game.cpp", 200));
        usr.add(new File("math.tex", 50));

        root.accept(new ListVisitor());

    }
}
