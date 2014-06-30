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
public class Mammal extends Animal {

    double milkProduced; // volume in cc

    protected double getMilkProduced() {
        return milkProduced;
    }

    protected void setMilkProduced(double m) {
        milkProduced = m;
    }
}
