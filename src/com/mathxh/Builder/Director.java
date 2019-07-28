package com.mathxh.Builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Menu");

        builder.makeClass("Vegetables");
        builder.makeItems(new String[]{
                "Scrambled Egg with Tomato",
                "Shredded Potato with Green Pepper",
                "Bitter vegetable soup"
        });

        builder.makeClass("Pungent Foods");
        builder.makeItems(new String[]{
                "braised common carp",
                "saute diced chicken with hot peppers",
                "saute pork in hot sauce"
        });

        builder.makeClass("Chinese Pastry&Cooked Wheaten Food");
        builder.makeItems(new String[]{
                "noodles with sesame paste&pea sprouts",
                "saute fine noodles with shredded chicken",
                "noodles in superior soup"
        });
    }
}
