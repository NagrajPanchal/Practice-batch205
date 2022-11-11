package com.bridgelabz.exceptions;

import java.io.FileNotFoundException;

// While overriding , the exceptions thrown using throws keyword must be having either same exception class or Parent-child relationship.
class P9{
    void m3() throws Exception {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("m3() in P9");
    }
}
public class P7 extends P9{


    @Override
    void m3() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("m3() in P7");
    }

}
