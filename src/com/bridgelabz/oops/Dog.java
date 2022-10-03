
package com.bridgelabz.oops;

public class Dog
{
    static String breed; // null
    static int age; // 0
    static String color; // null
    public final static String VOICE = "Barking";
    static void eat()
    {
        System.out.println(breed+VOICE);
        System.out.println("eat");
    }

    static void sleep(){
        System.out.println("sleep");
    }

    static void walk(){
        System.out.println("walk");
    }

    public static void main(String[] args) {
        System.out.println(breed);
        System.out.println(age);
        System.out.println(color);
        System.out.println(VOICE);

        breed = "Labrador";
        color = "brown";
        age = 5;
//        VOICE = "Bark";

        System.out.println(breed);
        System.out.println(age);
        System.out.println(color);
        System.out.println(VOICE);

        eat();
        sleep();
        walk();

        int x = age;
        // Some memory will be allocated when we create an object
        // left side is a reference holding that object
        // right side is the actual object
        Dog dog1 =  new Dog();


        dog1.breed = "Husky";
        dog1.color = "white";
        dog1.age = x+2;

        System.out.println(dog1.breed);
        System.out.println(dog1.age);
        System.out.println(dog1.color);
        System.out.println(dog1.VOICE);

        Dog dog2 = new Dog();
        dog2.breed = "german shefard";

        System.out.println(dog2.breed);
        System.out.println(dog2.age);
        System.out.println(dog2.color);
        System.out.println(dog2.VOICE);
        System.out.println(dog1.breed+VOICE+x);

        System.out.println(dog1.age);

    }

}
