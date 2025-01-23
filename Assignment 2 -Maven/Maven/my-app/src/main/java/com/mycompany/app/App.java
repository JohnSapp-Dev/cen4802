package com.mycompany.app;

/**
 * Hello world!
 */

public class App {

    public static int fibonacciValue(int n) {
        if(n==0) return n;
        if(n==1) return n;
        return fibonacciValue(n-1)+fibonacciValue(n-2);
    }
    public static void main(String[] args) {
        int value = 10;
        System.out.println("The value of the Fibonacci sequence at " + value +" = " + fibonacciValue(value));
    }
}
