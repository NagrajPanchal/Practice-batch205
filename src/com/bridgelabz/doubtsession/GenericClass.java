package com.bridgelabz.doubtsession;

public class GenericClass<T,R>
{
    T instanceVar1;
    R instanceVar2;

    public GenericClass() {
    }

    public GenericClass(T instanceVar1, R instanceVar2)
    {
        this.instanceVar1 = instanceVar1;
        this.instanceVar2 = instanceVar2;
    }
    void typesOfICECream(T typeOfOne, R typesOfTwo)
    {
        this.instanceVar1 = typeOfOne;
        this.instanceVar2 = typesOfTwo;
    }
    static <E> void names(E var1, E var2, E var3)
    {
        System.out.println("Name 1 : " +var1);
        System.out.println("Name 2 : " +var2);
        System.out.println("Name 3 : " +var3);
    }


    @Override
    public String toString() {
        return "ICE-Cream " +
                "instanceVar1 = " + instanceVar1 +
                "instanceVar2 = " + instanceVar2 ;
    }

    public static void main(String[] args)
    {
        GenericClass<Integer,Float> genericClassObject1= new GenericClass<>(12,12.2F);
        System.out.println(genericClassObject1);
        GenericClass<String,String> genericClassObject2 = new GenericClass<>("Cone","Box");
        System.out.println(genericClassObject2);
        GenericClass genericClassObject3 = new GenericClass();
        genericClassObject3.instanceVar1 = 12.43;
        genericClassObject3.instanceVar2 = "Nagraj";
        System.out.println(genericClassObject3);

        names("Apple","Manago","Kiwi");

    }
}
