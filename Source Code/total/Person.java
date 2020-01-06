	
package com.example.mp.total;

public class Person {
    private static int total = 0;

    Person() {
        total++;
    }

    public static int getTotal() {
        return total;
    }
}