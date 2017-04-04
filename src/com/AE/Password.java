package com.AE;

/**
 * Created by Angel on 1/23/17.
 */
public class Password {
    private static final int key = 74876362;
    private final int encrytedPassword;

    public Password(int password) {
        this.encrytedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password){
        return password ^ key;
    }

    public final void storePassword(){
        System.out.println("Saving password as " + this.encrytedPassword);
    }

    public boolean letMeIn(int password){
        if(encryptDecrypt(password) == this.encrytedPassword){
            System.out.println("Welcome");
            return true;
        }else{
            System.out.println("Nope, you cannot come in");
            return false;
        }

    }



}
