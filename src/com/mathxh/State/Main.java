package com.mathxh.State;

/*
* 状态模式： 用类来表示状态。将复杂的程序分解开。其实就是一个状态机.
*
* 其实银行的ATM机器里面的代码设计用状态机这样类似的设计最多了
*
*/

public class Main {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("State sample");
        while(true) {
            for (int hour = 0; hour < 24; ++hour) {
                frame.setClock(hour);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
