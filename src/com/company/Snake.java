package com.company;

public final class Snake extends WildAnimal {
    private String name;
    private Color color;


    public Snake(String name, Color color ,int age, String danger, Location location) {
        super(age, danger, location);
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void wildSound(String wildSound, int number) {
        super.wildSound(wildSound, number);
    }

    public String getInfo () {
        return "Имя : " +name+"; " + "Цвет : " +color+"; " +super.getInfo();
    }
}
