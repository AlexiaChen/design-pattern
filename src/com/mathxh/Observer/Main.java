package com.mathxh.Observer;

/*
* 观察者模式： 当观察对象的状态发生变化时，就会通知观察者，适合根据对象状态进行相应处理的场景
*
*  Model/View 就显然利用了这种模式，Model（不依赖显示形式的内部模型）View（怎样显示），所以一个Model对应多个View
*  对于一种数据模型，可以ListView，TreeView，TableView等等，是很重要的一种设计模式
*
*  有时候这个模式也叫做发布-订阅模式，观察者注册进来，然后通知，注册进来的观察者才可以观察
*/

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer digitObserver = new DigitObserver();
        Observer graphObserver = new GraphObserver();

        generator.addObserver(digitObserver);
        generator.addObserver(graphObserver);

        generator.execute();
    }
}
