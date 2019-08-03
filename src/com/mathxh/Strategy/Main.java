package com.mathxh.Strategy;

/*
*  策略模式： 整体地替换算法（策略型算法，这种算法一般不是指排序这些基础算法）
*
* */

public class Main {
    public static void main(String[] args) {
        int seed1 = 314, seed2 = 15;

        Player player1 = new Player("Taro", new WinningStrategy(seed1));
        Player player2 = new Player("Hana", new ProbStrategy(seed2));

        for(int i = 0; i < 1000; ++i) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            System.out.println(player1.getName() + " hand: " + nextHand1.ToString());
            System.out.println(player2.getName() + " hand: " + nextHand2.ToString());
            if(nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner: " + player1.getName());
                player1.win();
                player2.lose();
            } else if (nextHand1.isWeakerThan(nextHand2)) {
                System.out.println("Winner: " + player2.getName());
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even ...");
                player1.even();
                player2.even();
            }

            System.out.println("----------------------------------");
        }

        System.out.println("Total Results:");
        System.out.println(player1.ToString());
        System.out.println(player2.ToString());
    }
}
