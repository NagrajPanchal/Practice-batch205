package com.bridgelabz.oops;

// Inheritence => Monkey IS-A Animal  => IS-A Relationship
// achieved using extends keyword

// Association => AddressBook HAS-A Contact => HAS-A Relationship
//                Car HAS-A Engine =>   Composition => Strong coupling
//                Car HAS-A MusicPlayer =>  Aggregation => Weak coupling
// achieved by creating objects

// Human => Heart => Composition
// Employee => Address => Aggregation

// Inheritence
class Animal1 {

}

class Monkey1 extends Animal1 {

}


// Association

class Car
{
    String model;
    String brand;
    String color;
    String startCar;
    MusicPlayer musicPlayer;
    Engine engine;
    Wheel wheel;

    public Car(Engine engineObject, MusicPlayer musicPlayerObject, Wheel wheelObject)
    {
        this.engine=engineObject;
        this.musicPlayer=musicPlayerObject;
        this.wheel=wheelObject;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStartCar() {
        return startCar;
    }

    public void setStartCar(String startCar) {
        this.startCar = startCar;
    }

    public MusicPlayer getMusicPlayer() {
        return musicPlayer;
    }

    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Car(MusicPlayer musicplayer, Engine engine, Wheel wheel)
    {
        this.musicPlayer = musicplayer;
        this.engine = engine;
        this.wheel = wheel;
    }

    void startCar()
    {
        System.out.println("Car Started");
        engine.startEngin();
        musicPlayer.startPLayer();
        wheel.rotateWheel();
    }

    @Override
    public String toString() {
        return "Car " +
                "model = " + model + '\'' +
                ", brand = " + brand + '\'' +
                ", color = " + color + '\'' +
                ", startCar='" + startCar + '\'' ;
    }
}
class Engine
{
    String engineType;

    public Engine()
    {
    }

    public Engine(String engineType)
    {
        this.engineType = engineType;
    }
    void startEngin()
    {
        System.out.println("Engin Type :=> "+ engineType);
        System.out.println("Start Engine");
    }

    @Override
    public String toString() {
        return "Engine " + "engineType :=> " + engineType + '\'';
    }
}
class MusicPlayer
{
    String brand;
    public MusicPlayer()
    {
    }

    public MusicPlayer(String brand) {
        this.brand = brand;
    }
    void startPLayer()
    {
        System.out.println("Player brand : => "+ brand);
        System.out.println("Start Music Player");
    }

    @Override
    public String toString()
    {
        return "MusicPlayer " +"brand = " + brand + '\n';
    }
}
class Wheel
{
    String wheelBrand;
    String wheelSize;
    String wheelWeight;

    public Wheel()
    {
    }

    public Wheel(String wheelBrand, String wheelSize, String wheelWeight)
    {
        this.wheelBrand = wheelBrand;
        this.wheelSize = wheelSize;
        this.wheelWeight = wheelWeight;
    }
    void rotateWheel()
    {
        System.out.println("Wheel Brand : " + wheelBrand);
        System.out.println("Wheel Size : " + wheelSize);
        System.out.println("Wheel Weight : "+ wheelWeight);
        System.out.println("Rotate Wheel");
        rotateWheelClockWiseDirection();
        rotateWheelAntiClockWiseDirection();
    }
    void rotateWheelClockWiseDirection()
    {
        System.out.println("Rotate Wheel Clock Wise Direction");
    }
    void rotateWheelAntiClockWiseDirection()
    {
        System.out.println("Rotate Wheel Anti Clock Wise Direction");
    }

    @Override
    public String toString() {
        return "Wheel " +
                "wheelBrand = " + wheelBrand + '\n' +
                "wheelSize = " + wheelSize + '\n' +
                "wheelWeight = " + wheelWeight + '\n';
    }
}

public class AssociationExample
{
    public static void main(String[] args)
    {
        Engine engineObject = new Engine("TATA-01");
        MusicPlayer musicPlayerObject = new MusicPlayer("Sony");
        Wheel wheelObject = new Wheel("CEAT","2ft","5Kg");
        Car carObject = new Car(engineObject,musicPlayerObject,wheelObject);
        carObject.setBrand("TATA");
        carObject.setColor("White");
        carObject.setModel("TATA-01");
        carObject.setStartCar("Car Started");
        carObject.startCar();
        System.out.println(carObject);
        engineObject.startEngin();
        musicPlayerObject.startPLayer();
        wheelObject.rotateWheel();
    }
}
