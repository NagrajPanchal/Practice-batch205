package com.bridgelabz.generics;

import com.bridgelabz.doubtsession.Contact;

import java.util.ArrayList;
import java.util.List;

//class level generic
// Only applied in non-static
// Class-level generic will only work for Object level variables and Object level methods.
public class Generics2<T,E>
{
    T instVar1;
    E instVar2;
    static int staticVar;
    void method1(T var)
    {
        System.out.println(instVar1);
        System.out.println(instVar2);
        System.out.println(var);
    }

    @Override
    public String toString()
    {
        return "Generics for class-level " +
                "instVar1 = " + instVar1 +'\t'+
                "instVar2 = " + instVar2 +'\t';
    }

    static <X,Y>void method2(X var1, Y var2)
    {
        System.out.println("var1 => " +var1);
        System.out.println("var2 => " +var2);
    }

    public static void main(String[] args)
    {
        Generics2<Integer,Float> generics2IntObj = new Generics2<>();
        generics2IntObj.instVar1 = 12; // Integer Generic
        generics2IntObj.instVar2 = 12.1f; //float generic
        System.out.println(generics2IntObj);
        generics2IntObj.method1(121);
        method2(12,13);
        System.out.println("**************************");

        Generics2<Float,Integer> generics2FloatObj = new Generics2<>();
        generics2FloatObj.instVar1 = 2.1f; // float
        generics2FloatObj.instVar2 = 23; // Int
        System.out.println(generics2FloatObj);
        method2(12.2f,13.2f);
        method2("Nagraj",143);
        System.out.println("**************************");
        Generics2<Boolean,String> generics2Obj1 = new Generics2<>();
        System.out.println(generics2Obj1); // null
        generics2Obj1.instVar1 = true;
        generics2Obj1.instVar2 = "Panchal";
        System.out.println(generics2Obj1);
        method2(12.12,12.2F);
        System.out.println("**************************");

        Generics2 generics2Obj = new Generics2(); // here not using type safety
        System.out.println(generics2Obj);
        generics2Obj.instVar2 = "Nagraj";
        generics2Obj.instVar1 = 12;
        System.out.println(generics2Obj); // any
        generics2Obj.instVar1 = true;
        generics2Obj.instVar2 = 12.1f;
        System.out.println(generics2Obj); // any data types
        staticVar = 12; // int type static variable can't use generic
        System.out.println("Static variable "+staticVar);
        System.out.println("**************************");

        List<Contact> arrayList2 = new ArrayList<>();
        arrayList2.add(new Contact());

        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Nagraj Panchal");
        List<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(123);


    }
}
