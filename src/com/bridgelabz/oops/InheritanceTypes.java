// Inheritance Types

package com.bridgelabz.oops;

// Single Level Inheritance A--> B
//Multi level Inheritance A --> B --> C
// Hierarchial Inheritance A --> B, A --> C
// Multiple and Hybrid Inheritance :=> Not supported by the Class
class A1{
    int x = 10;

    void m1(){
        System.out.println("m1");
    }
}
// Single Inheritence
class B1 extends A1{
    int y = 30;

    void m2(){
        System.out.println("m2");
    }
}
//Multi-level Inheritence
class C1 extends B1{
    int z = 40;

    void m3(){
        System.out.println("m3");
    }
}

// Hirerarchial Inheritence
class D1 extends A1{
    int u = 12;

    void m5(){
        System.out.println("m5");
    }
}

class E1 extends A1{
    int v = 23;

    void m6(){
        System.out.println("m6");
    }
}


class H1 {
    int h1 = 19;
    void m1(){
        System.out.println("H1 m1");
    }
}
class H2{
    int h2 = 34;
    void m2(){
        System.out.println("H2 m2");
    }

    void m1(){
        System.out.println("H2 m1");
    }
}

// Multiple inheritence is not supported through classes because of ambiguity
// Diamond Death problem
//class H3 extends H1,H2{
//    int h3 = 45;
//    void m3(){
//
//    }
//}

public class InheritanceTypes
{
    public static void main(String[] args)
    {
        A1 obj1 = new A1();
        System.out.println(obj1.x);
        obj1.m1();
//        System.out.println(obj1.y);
//        obj1.m2();

        B1 obj2 = new B1();
        System.out.println(obj2.y);
        obj2.m2();
        System.out.println(obj2.x);
        obj2.m1();


        C1 obj3 = new C1();
        System.out.println(obj3.y);
        obj3.m2();
        System.out.println(obj3.x);
        obj3.m1();
        System.out.println(obj3.z);
        obj3.m3();

        D1 obj4 = new D1();
        System.out.println(obj4.u);
        System.out.println(obj4.x);
        obj4.m1();
        obj4.m5();

        E1 obj5 = new E1();
        System.out.println(obj5.v);
        System.out.println(obj5.x);
        obj5.m1();
        obj5.m6();
    }
}
