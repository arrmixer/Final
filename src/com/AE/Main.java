package com.AE;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//
//        one.getInstanceNumber();
//        two.getInstanceNumber();
//        three.getInstanceNumber();
//
//        System.out.println(Math.PI);
//        double m = ( Math.random()*100) * 2;
//        System.out.println(m);
//
//        int pw = 674312;
//        Password password = new ExtendedPassword(pw);
//        password.storePassword();
//
//        password.letMeIn(1);
//        password.letMeIn(523266);
//        password.letMeIn(9773);
//        password.letMeIn(0);
//        password.letMeIn(-1);
//        password.letMeIn(674312);


        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}
