package com.fibonacci;

public final class DynamicFib {
    private DynamicFib(){}

    public static int getFibElement(int k) {
        if(k == 0) { return 0; }
        if(k == 1) { return 1; }

        int[] _cache = new int[]{0,1};

        for(int i = 2; i <= k; i++) {
            int temp = _cache[0] + _cache[1];
            _cache[0] = _cache[1];
            _cache[1] = temp;
        }
        return _cache[1];
    }

}
