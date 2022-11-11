package com.bridgelabz.exceptions;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exception4 {

// try with resources
    static void methodA(){
        try (InputStream is = Files.newInputStream(Path.of("D:\\manu\\New folder (2)\\PerfiosLaptopData\\newfolder1\\RFPSample169\\src\\com\\bridgelaz\\exceptions\\abc.txt"));
                InputStreamReader isr = new InputStreamReader(is);
        ) {
            isr.getEncoding();
            System.out.println("methodA()");
        } catch (IOException ioe) {
            System.out.println("catch block");
        }
    }

    public static void main(String[] args) {
        methodA();
    }
}
