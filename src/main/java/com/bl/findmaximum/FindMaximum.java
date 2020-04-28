package com.bl.findmaximum;

public class FindMaximum {
    public Integer getMaximum(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(max) > 0)
            max=b;
        if (c.compareTo(max) > 0)
            max = c;

        return max;
    }

    public Float getMaximum(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(max) > 0)
            max=b;
        if (c.compareTo(max) > 0)
            max = c;

        return max;
    }
}
