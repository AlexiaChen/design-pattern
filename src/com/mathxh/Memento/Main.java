package com.mathxh.Memento;

/*
*  Memento模式：保存状态对象，备忘录模式。 其实就是把一个对象的状态dump出来，等到需要的时候再恢复
*  比如文本编辑器里的Undo，Redo，
*  还有一些应用程序里面的History，snapshot
*
*/

public class Main {
    public static void main(String[] args)  {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();

        for(int i = 0; i < 100; ++i) {
            System.out.println("=======  " + i);
            System.out.println(" Current state:" + gamer.toString());

            gamer.bet();

            System.out.println("Current amount of money: " + gamer.getMoney() + " yuan.");

            if(gamer.getMoney() > memento.getMoney()) {
                System.out.println("Money increased a lot. so save current state of game");
                memento = gamer.createMemento();
            } else if(gamer.getMoney() < memento.getMoney()) {
                System.out.println("Money down to a lot. so restore the previous state");
                gamer.restoreMemento(memento);
            }


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("");


        }
    }
}
