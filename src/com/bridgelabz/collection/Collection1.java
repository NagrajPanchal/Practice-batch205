package com.bridgelabz.collection;
interface I1{
    void m1();
}

interface I2{
    void m2();
}

interface I3 extends I1,I2{

}
class ABCD{

}

class Impl1 extends ABCD implements I1,I3{

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }
}
public class Collection1 {
}
