package com.bridgelabz.annotations;

public class TestOverrideAnimal
{
    void eatSomething()
    {
        System.out.println("Eat Something");
    }
    static class Dog extends TestOverrideAnimal
    {
        @Override
        void eatSomething() {
            System.out.println("Eating foods");
        }
    }
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.eatSomething();
    }
}
