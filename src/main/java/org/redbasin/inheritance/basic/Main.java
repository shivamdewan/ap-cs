/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.redbasin.inheritance.basic;

/**
 *
 * @author redbasin
 */
public class Main {

    public static void main(String[] args) {
        Human mary = new Human();
        System.out.println("limbs = " + mary.getLimbs());
        System.out.println("milk = " + mary.getMilkProduced());
        System.out.println("fingers = " + mary.getFingers());
    }
}
