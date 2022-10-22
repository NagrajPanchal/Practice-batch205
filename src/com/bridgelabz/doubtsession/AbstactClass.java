// Abstract Class
package com.bridgelabz.doubtsession;

abstract class Phone
{
int length;
abstract int display(int length);
abstract void battery();
static void charger()
{
    System.out.println("Charger -> cable with adapter Phone");
}

}
abstract class FeaturePhone1 extends Phone
{
    public FeaturePhone1()
    {
    }

    @Override
    int display(int size)
    {
        System.out.println("Display Size");
        return size;
    }

}
class Feature2Phone extends FeaturePhone1
{
    @Override
    void battery()
    {
        System.out.println("5000MAH");
    }
}

public class AbstactClass
{
    public static void main(String[] args)
    {
        Feature2Phone feature2PhoneObject = new Feature2Phone();
        feature2PhoneObject.battery();
        System.out.print(feature2PhoneObject.display(6));

    }
}
