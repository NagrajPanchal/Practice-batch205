
package com.bridgelabz.oops;

import java.util.Objects;

public class Dog implements Comparable<Dog> {
    int height,weight,length;
    String name,food;

    // Compiler creates a default constructor when there is no constructor present in the class.
    // When the constructor is already created , then compiler will not create any constructor.
    public Dog()
    {

    }
    public Dog(int dogOfAge)
    {
        age = dogOfAge;
    }
    public Dog(String breedOfDog, int ageOFDog)
    {
     breed = breedOfDog;
     age = ageOFDog;
    }
    // this keyword is used for refering to the current object
    public Dog(String breed,int age,String color)
    {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
    public Dog(int heightOfDog, int weightOfDog, int lengthOfDog)
    {
        this.height = heightOfDog;
        this.weight = weightOfDog;
        this.length = lengthOfDog;
    }





    public static String breed; // null
    public static int age; // 0
    public static String color; // null
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

    public Dog(String name, String food)
    {
        this.name = name;
        this.food = food;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return height == dog.height && weight == dog.weight && length == dog.length;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(height, weight, length);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                '}';
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
        System.out.println(dog1.age+100);

        System.out.println(dog1.age);
        Dog dog11 = new Dog(11);
        System.out.println(dog11.age);
        System.out.println(dog11.age+age);
        Dog dog12 = new Dog("Local",12);
        System.out.println(dog12.breed);
        System.out.println(dog12.age);
        Dog dog3 = new Dog("Pitbull",13,"White");
        System.out.println(dog3.breed);
        System.out.println(dog3.age);
        System.out.println(dog3.color);

        Dog dog14 = new Dog(4,15,3);
        System.out.println(dog14.height);
        System.out.println(dog14.weight);
        System.out.println(dog14.length);

        System.out.println(dog14.equals(dog14));
        System.out.println(dog1.equals("ABC"));

    }

}
