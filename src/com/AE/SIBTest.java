package com.AE;

/**
 * Created by Angel on 1/25/17.
 */
public class SIBTest {
    public static final String owner;

    static {
        owner ="tim";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIB constructor called");
    }

    static{
        System.out.println("2nd initialization block called");
    }

    public void someMethod(){
        System.out.println("someMethod called");
    }
}
