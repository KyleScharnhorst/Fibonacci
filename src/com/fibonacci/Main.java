package com.fibonacci;
import com.fibonacci.CompareFibonacci.*;

public class Main {

    public static void testDynamicFib(int max_executions) {
        long before;
        long after;
        long avg;
        //        DynamicFib df = new DynamicFib();
        System.out.println("Dynamic fib result: " + DynamicFib.getFibElement(0));
        System.out.println("Dynamic fib result: " + DynamicFib.getFibElement(1));
        System.out.println("Dynamic fib result: " + DynamicFib.getFibElement(2));
        System.out.println("Dynamic fib result: " + DynamicFib.getFibElement(5));
        System.out.println("Dynamic fib result: " + DynamicFib.getFibElement(10));
        System.out.println("Dynamic fib result: " + DynamicFib.getFibElement(46));

        avg = 0;
        for (int i = 0; i < max_executions; i++) {
            before = System.nanoTime();
            DynamicFib.getFibElement(46);
            after = System.nanoTime();
            avg += after - before;
        }
        avg /= max_executions;

        System.out.println("Time to generate 46th Fibonacci element: " + avg + "ns");
    }

    public static void main(String[] args) {
        // compare basic recursion vs dynamic fib
        int max_executions = 3;

        testDynamicFib(max_executions);

    }
}