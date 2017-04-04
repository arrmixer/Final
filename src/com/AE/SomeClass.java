package com.AE;

/**
 * Created by Angel on 1/14/17.
 */
public class SomeClass {
    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;

    public SomeClass(String name){
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);

    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
