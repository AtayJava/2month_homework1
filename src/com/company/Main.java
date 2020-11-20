package com.company;

public class Main {

    public static void main(String[] args) {

        WildAnimal wildAnimal =new WildAnimal(5,"Опасный вид;", new Location("Вблизи 100м"));
        wildAnimal.getAge();
        wildAnimal.getDanger();
        wildAnimal.getLocation( );
        System.out.println(wildAnimal.getInfo());
        System.out.println("Звук особи :");
        wildAnimal.wildSound("Shh shh");


        System.out.println(" ");


        Snake snake1 = new Snake("Петя", Color.BLACK,
                3,"Безопасный вид", new Location("Около 15м"));
        snake1.getName();
        snake1.getColor();
        snake1.getAge();
        snake1.getDanger();
        snake1.getLocation();
        System.out.println(snake1.getInfo());
        snake1.wildSound("Тссс ",2);

        System.out.println(" ");


        Snake snake2 = new Snake("Гоша", Color.RED,
                5,"Ядовитый вид", new Location("Около 35м"));
        snake2.getName();
        snake2.getColor();
        snake2.getAge();
        snake2.getDanger();
        snake2.getLocation();
        System.out.println(snake2.getInfo());
        snake2.wildSound("Щщщ щщщ ",3);





    }
}
