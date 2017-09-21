package com.fibonacci;

public final class DynamicFib {
    private static int[] _cache;

    private DynamicFib(){}

    public static int getFibElement(int k) {
        int result;
        //check for base case before any work.
        if(k <= 1) {
            result = k;
        } else {
            //init cache
            _cache = new int[k+1];
            _cache[1] = 1;

            //begin recursion
            result = recurseFib(k);
        }

        return result;
    }

    private static int recurseFib(int n) {
        int result;

        if( n <= 1) {
            result = n;
        } else if( _cache[n] != 0 ) {
            result = _cache[n];
        } else {
            _cache[n] = result = recurseFib(n-1) + recurseFib(n-2);
        }

        return result;
    }
}
