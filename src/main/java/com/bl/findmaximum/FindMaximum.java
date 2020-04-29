package com.bl.findmaximum;

public class FindMaximum<X extends Comparable,Y extends Comparable,Z extends Comparable> {
    public X[] x;
    public Y[] y;
    public Z[] z;

    public FindMaximum() {

    }

    public FindMaximum(X[] x,Y[] y,Z[] z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public <E extends Comparable> void getMaximum() {
        getMaximum(x);
        getMaximum(y);
        getMaximum(z);
    }

    public static <E extends Comparable> E getMaximum(E a, E b, E c) {
        E max = a;
        if(b.compareTo(max) > 0)
            max = b;
        if(c.compareTo(max) > 0)
            max = c;

        return max;
    }

    public static <E extends Comparable> E getMaximum(E[] a) {
        E max = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i].compareTo(max) > 0)
                max=a[i];
        }

        return max;
    }

   /* public Float getMaximum(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(max) > 0)
            max=b;
        if (c.compareTo(max) > 0)
            max = c;

        return max;
    }

    public String getMaximum(String a, String b, String c) {
        String max = a;
        if (b.compareTo(max) > 0)
            max=b;
        if (c.compareTo(max) > 0)
            max = c;

        return max;
    }*/
}
