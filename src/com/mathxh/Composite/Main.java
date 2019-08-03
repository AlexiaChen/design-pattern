package com.mathxh.Composite;

/*
*  组合模式： 容器与内容的一致性。
*   应用： 想象下操作系统中的文件系统，文件夹和文件虽然是不同的类型，但是它们两个都可以放入到文件夹中，从某种意义这两个东西是等价的。
*     类似于递归的树形结构，文件属于叶子节点，文件夹是普通节点
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

        root.printList();
    }
}
