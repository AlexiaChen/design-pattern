package com.mathxh.Strategy;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random;
    private int prevHandValue = 0;
    private int currentHandleValue = 0;

    private int[][] history = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1},
    };

    public  ProbStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandleValue));
        int handValue = 0;
        if(bet < history[currentHandleValue][0]) {
            handValue = 0;
        }else if(bet < history[currentHandleValue][0] + history[currentHandleValue][1]) {
            handValue = 1;
        }else {
            handValue = 2;
        }
        prevHandValue = currentHandleValue;
        currentHandleValue = handValue;
        return Hand.getHand(handValue);
    }

    @Override
    public void study(boolean win) {
        if(win) {
            history[prevHandValue][currentHandleValue]++;
        } else {
            history[prevHandValue][(currentHandleValue + 1) % 3]++;
            history[prevHandValue][(currentHandleValue + 2) % 3]++;
        }
    }

    private int getSum(int hv) {
        int sum = 0;
        for(int i = 0; i < 3; ++i) {
            sum += history[hv][i];
        }
        return sum;
    }
}
