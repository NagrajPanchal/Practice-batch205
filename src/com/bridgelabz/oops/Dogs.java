
package com.bridgelabz.oops;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Dogs
{
    public String breed; // null

    public int age; // 0
    static String color; // null

    public static final String VOICE = "bark!!!";



    static void eat(){

        System.out.println("eat"+color);

    }

    static void sleep(){
        System.out.println("sleep");
    }

    static void walk(){
        System.out.println("walk");
    }

    public static void main(String[] args) {
//        System.out.println(breed);
//        System.out.println(age);
//        System.out.println(color);

//        breed = "Labrador";
//        color = "brown";
//        age = 5;

//        System.out.println(breed);
//        System.out.println(age);
//        System.out.println(color);

        eat();
        Dogs.sleep();
        Dog.walk();

        int x = 10;
        // Some memory will be allocated when we create an object
        // left side is a reference holding that object
        // right side is the actual object
        Dogs dog1 =  new Dogs(); // instance variable will get the memory at this object creation
        System.out.println(dog1.breed); // null
        System.out.println(dog1.age); // 0
        System.out.println(dog1.color); // null
        System.out.println(dog1.VOICE);


        dog1.breed = "Husky";
        dog1.color = "white";
        dog1.age = 6;

        System.out.println(dog1.breed);
        System.out.println(dog1.age);
        System.out.println(dog1.color);

        Dog dog2 = new Dog(); // other class Instance Object Created
        System.out.println(dog2.breed); // null
        System.out.println(dog2.age); // 0
        System.out.println(dog2.color); //null
        System.out.println(dog2.VOICE+dog1.VOICE);

        dog2.breed = "german shefard";

        System.out.println(dog2.breed); // "german shefard"
        System.out.println(dog2.age); // 0
        System.out.println(dog2.color); // null

        System.out.println(dog1.breed); // "Husky"

    }

}
