package com.mathxh.ChainOfResponsibility;

/*
*  职责链模式： 一层一层的推卸责任。将多个对象组成一条链，然后按照它们在职责链上的顺序一个一个地找出到底应该由谁来负责
*  很类似与异常的匹配, 岗位职责层级认领机制。
*
*
*/
public class Main {
    public static void main(String[] args) {
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 100);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana = new LimitSupport("Diana", 200);
        Support jack = new OddSupport("Jack");
        Support jenny = new LimitSupport("Jenny", 300);

        alice
        .setNext(bob)
        .setNext(charlie)
        .setNext(diana)
        .setNext(jack)
        .setNext(jenny);

        for (int i = 0; i < 500; i += 33) {
            alice.support(new Trouble(i));
        }
    }
}
