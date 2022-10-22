package com.bridgelabz.oops;

class Animal
{
    int x;
    void m1()
    {
        System.out.println("method(A)");
    }
}
class Monkey extends Animal
{
    int y;
    void m2()
    {
        System.out.println("method(B)");
    }
}
class Test
{
    // Whenever we overload method resolution is taken care by the compiler based on run-time object
    void method1(Animal animal)
    {
        System.out.println("method1(Animal) ");
    }
    void method1(Monkey monkey)
    {
        System.out.println("method1(Monkey) ");
    }
}
public class Ploymorphisum1
{
    public static void main(String[] args)
    {
        Animal animalObject = new Animal();
        Monkey monkeyObject = new Monkey();
        Animal obj = new Monkey();

        Test test = new Test();
        test.method1(monkeyObject); // method1(monkey)
        test.method1(animalObject); // method1(animal)
        test.method1(obj); // method1(animal)
    }
}
