// Single level Inheritance
// getter and setter methods
package com.bridgelabz.doubtsession;

class Animals // Parent class
{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static  void animal() // static method
    {
        System.out.println("Animal Parent Class");
    }
    void eat()
    {
        String food = "Non-veg";
        System.out.println(food);
    }
}
class Lion extends Animals // child class inherited from parent class
{
    void weight()
    {
        int weight = 50;
        System.out.println(weight);
    }
    void color()
    {
        String color = "Yellow";
        System.out.println(color);
    }
}
public class Animal // main class
{
    public static void main(String[] args) // main method
    {
        Animals an = new Animals();
        an.setAge(20); // setter Method
        System.out.println(an.getAge()); // getter Method
        Lion obj1 = new Lion(); // Object Creation for Child class
        Lion.animal(); // Static method
        obj1.color(); // Non -static method
        obj1.eat();
        obj1.weight();

    }
}
