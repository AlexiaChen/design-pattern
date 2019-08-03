package com.mathxh.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory.");
            System.out.println("Example: java Main [ListFactory | TableFactory].");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);

        Link people = factory.createLink("The People's Daily", "http://www.people.com.cn/");
        Link gmw = factory.createLink("Guang Ming Daily", "http://www.gmw.cn/");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japen", "http://www.yahoo.co.jp/");

        Link bing = factory.createLink("Bing", "http://www.bing.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray traynews = factory.createTray("Daily");
        traynews.add(people);
        traynews.add(gmw);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(jp_yahoo);

        Tray traysearch = factory.createTray("Search Engine");
        traysearch.add(trayyahoo);
        traysearch.add(bing);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "MathxH");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
