package com.bridgelabz.annotations;

import java.util.ArrayList;

public class TestSuppressWarnings
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        for (Object obj: arrayList)
        {
            System.out.println(obj);
        }
    }
}
