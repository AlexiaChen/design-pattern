package com.mathxh.Mediator;


/*
*  仲裁者模式：要调整多个对象之间的关系就需要用到，由仲裁者下达指令，各自对象与仲裁者通信
*
*  实质上就是让一个仲裁者管理多个对象的状态，把状态设置的代码放到仲裁者里面，集中管理状态，可读性更高
*
*/

public class Main {
    public static void main(String[] args) {
        new LoginFrame("Mediator sample");
    }
}
