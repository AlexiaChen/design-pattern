package com.mathxh.Strategy;

import java.util.Hashtable;

public class Hand {
    public enum HandValue {
        ROCK(0),
        SCISSORS(1),
        PAPER(2);

        int value;
        HandValue(int v) {
            value = v;
        }
    }

    public static final Hand[] hand = {
            new Hand(HandValue.ROCK),
            new Hand(HandValue.SCISSORS),
            new Hand(HandValue.PAPER),
    };

    public static final Hashtable<Integer, String> handHashTable = new Hashtable<Integer, String>(){
        {
            put(HandValue.ROCK.value, "石头");
            put(HandValue.SCISSORS.value, "剪刀");
            put(HandValue.PAPER.value, "布");
        }
    };

    private HandValue handValue;
    private Hand(HandValue handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int index) {
        return hand[index];
    }

    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }

    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }

    private int fight(Hand hand) {
        if (this == hand) {
            return 0;
        }else if((this.handValue.value + 1) % 3 == hand.handValue.value) {
            return 1;
        }else {
            return -1;
        }
    }

    public String ToString() {
        return handHashTable.get(handValue.value);
    }
}
