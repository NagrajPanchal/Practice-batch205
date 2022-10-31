package com.bridgelabz.datastructure;

import com.bridgelabz.oops.Dog;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class HashCodeConcepts
{
    public static void main(String[] args) {

        List<Dog> list = new ArrayList<>();
        List<Dog> list1 = new ArrayList<>();
        Hashtable<String,Dog> hashtable = new Hashtable<>();




        Dog dog1 = new Dog();
        System.out.println(dog1.hashCode());
        Dog dog2 = new Dog();
        System.out.println(dog2.hashCode());

        String str1 = "ABC";
        String str2 = "DEF";
        String str3 = str1;
        String str4 = new String("KGF");
        String str5 = new String("ABC");

        System.out.println(str1 == str2); // false : ref different Object
        System.out.println(str1.equals(str2)); // false
        System.out.println(str3.equals(str5)); // true same object


        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str5.hashCode());

        // String immutable nature
        // Cannot be changed
        String str6 = "DEF";
        System.out.println(str2 == str6);
        str6 = "KGF";
        System.out.println(str6);

//        String strA = "hello";
//        String strB = "meklo";
//        int unicodeA = (int) strA;
//        int unicodeB = (int) strB;
//        System.out.println(strA);
//        System.out.println(strB);
//        System.out.println(unicodeA);
//        System.out.println(unicodeB);


    }
}
