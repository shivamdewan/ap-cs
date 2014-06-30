/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.redbasin.lesson1;

/**
 * Understanding static variables.
 * Note that the static color variable is shared across two instances of
 * the Mango class.
 *
 * @author redbasin
 */
class Mango {

    static public String color = "red";

    public static void main(String[] args) {
        Mango m1 = new Mango();
        m1.color = "green";
        System.out.println(m1.color);
        Mango m2 = new Mango();
        m2.color = "yellow";
        System.out.println(m2.color);
         System.out.println(m1.color);

    }

}
