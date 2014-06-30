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
public class Human extends Mammal {

    public Human() {
        setLimbs(2);
        setFingers(5);
        setMilkProduced(1000);
    }

    int numFingers; // volume in cc

    public int getFingers() {
        return numFingers;
    }

    public void setFingers(int digits) {
        numFingers = digits;
    }

}

