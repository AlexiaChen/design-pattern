package com.mathxh.Builder;

/*
*  建造者模式： 组装复杂的实例。建造者可以有多个不同的类型建造者，然后由监工来构造建造大概的建造目标
*
*/

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }

        if(args[0].equals("plain")) {
            TextBuilder builder = new TextBuilder();
            Director director = new Director(builder);
            director.construct();

            String result = builder.getResult();
            System.out.println(result);
        }else if(args[0].equals("html")){
            HTMLBuilder builder = new HTMLBuilder();
            Director director = new Director(builder);
            director.construct();

            String filename = builder.getResult();
            System.out.println(filename + " file generate finished.");
        }else {
            usage();
            System.exit(0);
        }
    }

    public static void usage() {
        System.out.println("Usage: java Main plain");
        System.out.println("Usage: java Main html");
    }
}
