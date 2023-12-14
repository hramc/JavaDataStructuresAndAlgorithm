package algorithms.search;

import java.security.KeyPair;

public class Searching {

    private int findIndex(int[] values, int searchValue) {
        for(int i=0; i<values.length; i++) {
            if (values[i] == searchValue)
                return i;
        }

        return -1;
    }

    private int findIndexByBinarySearch(int[] sortedValues, int searchValue) {

        int low = 0;
        int high = sortedValues.length-1;

        while (low <= high) {
            int mid = (low + high ) / 2;

            if (sortedValues[mid] == searchValue)
                return mid;

            if (sortedValues[mid] < searchValue)
                low = mid + 1;
            else
                high = mid - 1;
        }

             return -1;

    }

    /**
     *
     * @param values
     * @return
     * 0 - it is not sorted
     * 1 - It is sorted in ascending manner
     * 2 - it is sorted in descending manner
     */
    private int isArraySorted(int[] values) {
        if(values.length <= 1)
            return 1;

        boolean ascOrder = true;

        for (int i=0;i < values.length-1; i++) {
            if (values[i] > values[i+1]) {
                ascOrder = false;
                break;
            }
        }

        boolean descOrder = true;
        for (int i=0;i < values.length-1; i++) {
            if (values[i] < values[i+1]) {
                descOrder = false;
                break;
            }
        }

        if (!ascOrder && !descOrder)
            return 0;
        else if (ascOrder)
            return 1;
        else
            return 2;


    }

    public static void main(String[] args) {
        Searching searching = new Searching();
        int[] values = {1,2,3,4,5,6,7,8,9,9,9,10,10,11};

        System.out.println(searching.findIndex(values, 2));
        System.out.println(searching.findIndex(values, 9));
        System.out.println(searching.findIndex(values, 12));

        System.out.println(searching.findIndexByBinarySearch(values, 2));
        System.out.println(searching.findIndexByBinarySearch(values, 9));
        System.out.println(searching.findIndexByBinarySearch(values, 12));

        System.out.println(searching.isArraySorted(values));
        int[] values1 = {1,2,3,4,5,6,8,7,9,10,11};
        System.out.println(searching.isArraySorted(values1));
        int[] values2 = {11,11,9,8,7,6};
        System.out.println(searching.isArraySorted(values2));


    }



}
