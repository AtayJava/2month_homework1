package com.company;

public class WildAnimal extends Animal {
    private String danger;
    private Location location;


    public WildAnimal (int age, String danger, Location location) {
        super(age);
        this.danger =danger;
        this.location = location;
    }


    public String getDanger() {
        return danger;
    }

    public Location getLocation() {
        return location;
    }

    public void wildSound (String wildSound, int number) {
        for (int i = 0; i <number ; i++) {
            System.out.println(wildSound);
        }
    }

     public final void wildSound (String wildSound) {
        System.out.println(wildSound);
    }


    public String getInfo () {
        return "Дикое животное - "+ "Danger : " +danger+ " " +"Age : " +super.getAge()+";" +" " +"Location : " +
                location;
    }




}
