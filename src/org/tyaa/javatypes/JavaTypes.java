/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javatypes;

import java.util.Arrays;
import org.tyaa.javatypes.utils.MyPrinter;

/**
 *
 * @author Yurii
 */
public class JavaTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //(new MyPrinter()).sayHello();
        
        //Value types (primitive)
        byte b1 = 100;
        //https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
        char ch1 = 'A';
        for (int i = 0; i < 26; i++) {
            System.out.println(ch1 + " - " + (int)ch1);
            ch1++;
        }
        float f1 = 14.5f;
        double d1 = 14.5d;
        
        boolean bool1 = true;
        
        //Reference types (object)
        String s1 = "Hello ";
        String s2 = String.valueOf("Hello ".toCharArray());
        //String s2 = "Hello 1";
        //s1 += "World!";
        
        System.out.println(s1);
        System.out.println(s2);
        
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
    
}
