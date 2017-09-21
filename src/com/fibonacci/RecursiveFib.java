package com.fibonacci;

public class RecursiveFib {
    private RecursiveFib(){}

    public static int getFibElement(int k) {
        if (k == 0) { return 0; }
        if (k == 1) { return 1; }
        return recurseFib(k);
    }

    private static int recurseFib(int n) {
        if( n <= 1) {
            return n;
        }
        return recurseFib(n-1) + recurseFib(n-2);
    }

}
