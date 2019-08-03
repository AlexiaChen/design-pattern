package com.mathxh.Singleton;


// 只有一个实例， 现实中需要考虑下它的线程安全。如果程序中有一个东西只会有一个时，就考虑用它，比如系统垃圾箱，回收站，桌面窗口系统啥的

public class Main {
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("obj1 and obj2 is same instance");
        } else {
            System.out.println("obj1 and obj2 is not same instance");
        }
    }
}
