/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simple_calculator;

/**
 *
 * @author rifa1
 */
public class Calculator {

    public void multiply(double a, double b) {
        System.out.println(a * b);
    }
    public void power(double a, double b) {
        System.out.println((Math.pow(a, b)));
    }

    public void divide(double a, double b) {
        if (b == 0) {
            System.out.println("It's forbidden to divide on zero");
        } else {
            System.out.println(a / b);
        }
    }
}
