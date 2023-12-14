package algorithms.recursive;

import java.util.Arrays;

public class RecursiveFunctions {

    private String countDown(int value) {

        return (value == 0) ? String.valueOf(value).concat("\nDone!") : String.valueOf(value).concat("\n").concat(countDown(value - 1));

    }

    private long power(long x, long y) {
        return (y == 1) ? x: (x*power(x, y-1));
    }

    private long factorial(long x) {
        return (x == 0) ?  1 : x * factorial(x -1);
    }

    private long findMaxOrMin(long[] values, boolean min) {

        return (values.length == 1) ?
                values[0] : min ?
                Math.min(values[0], findMaxOrMin(Arrays.copyOfRange(values, 1, values.length), true)) :
                Math.max(values[0], findMaxOrMin(Arrays.copyOfRange(values, 1, values.length), false));

    }

    public static void main(String[] args) {
        RecursiveFunctions recursiveFunctions = new RecursiveFunctions();
        System.out.println(recursiveFunctions.countDown(5));
        System.out.println(recursiveFunctions.power(3L,3L));
        System.out.println(recursiveFunctions.factorial(5));
        System.out.println(recursiveFunctions.findMaxOrMin(new long[]{2L, 3L, 40000L, 100L, 1000L}, true));
        System.out.println(recursiveFunctions.findMaxOrMin(new long[]{2L, 3L, 40000L, 100L, 1000L}, false));
    }
}
