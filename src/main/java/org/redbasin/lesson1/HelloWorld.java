/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.redbasin.lesson1;

/**
 *
 * @author redbasin
 */
 public class HelloWorld {

    static int age = 10;

    public static int getAge() {
        return age;
    }

    public static void main(String[] args) {
        int myage = getAge();
        System.out.println(myage);
        double d = 1/0;
    }

}
