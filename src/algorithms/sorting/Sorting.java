package algorithms.sorting;

import java.util.Arrays;

public class Sorting {


    private void bubbleSort (int[] values, boolean desc) {

        for (int i=0; i<values.length; i++) {
            for (int j=i+1; j<values.length; j++) {
                if(desc ? values[j]>values[i]: values[j]<values[i]) {
                    int temp = values[j];
                    values[j] = values[i];
                    values[i] = temp;
                }
            }
        }
    }

    private int[] splitAndMerge(int[] values, boolean desc) {
        if (values.length == 1)
            return values;
        int mid = values.length / 2;
        return merge(splitAndMerge(Arrays.copyOfRange(values, 0, mid), desc),
                splitAndMerge(Arrays.copyOfRange(values, mid, values.length), desc),
                desc);
    }

    private int[] merge(int[] left, int[] right, boolean desc) {
        int[] data = new int[left.length + right.length];
        int leftCounter = 0;
        int rightCounter = 0;
        while(leftCounter<left.length || rightCounter<right.length) {
            data[leftCounter+rightCounter] =
                    leftCounter==left.length ? right[rightCounter++] :
                            rightCounter==right.length ? left[leftCounter++] :
                                    (desc ?  (left[leftCounter] < right[rightCounter] ?
                                            right[rightCounter++] : left[leftCounter++] ):
                                            (left[leftCounter] > right[rightCounter] ?
                                                    right[rightCounter++] : left[leftCounter++]));

        }

        return data;
    }

    private int partitionByLastItem(int[] values, int low, int high, boolean desc) {
        int i = low -1 ;
        int pivot = values[high];
        for(int j=low; j<high; j++) {
            if(desc ? values[j]>=pivot : values[j]<=pivot) {
                i++;
                swap(values, i, j);
            }
        }
        swap(values, i+1, high);
        return i+1;
    }

    private int partitionByFirstItem(int[] values, int low, int high, boolean desc) {
        int i = high+1 ;
        int pivot = values[low];
        for(int j=high; j>low; j--) {
            if(desc ? values[j]<=pivot : values[j]>=pivot) {
                i--;
                swap(values, i, j);
            }
        }
        swap(values, i-1, low);
        return i-1;
    }

    private void quickSort(int[] values, int low, int high, boolean desc, boolean firstItem) {
        if (low < high) {
            int pi = firstItem? partitionByFirstItem(values, low, high, desc) : partitionByLastItem(values, low, high, desc);
            quickSort(values,low,pi-1,desc, firstItem);
            quickSort(values, pi+1, high, desc, firstItem);
        }
    }

    private void swap(int[] values, int i, int j) {
        int temp = values[i];
        values[i] = values[j];
        values[j] = temp;
    }

    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        int[] values = {5,4,2,1,3};

        sorting.bubbleSort(values, false);
        sorting.printData(values);

        sorting.bubbleSort(values, true);
        sorting.printData(values);

        int[] mergeValues = {5,4,2,1,3};
        sorting.printData(sorting.splitAndMerge(mergeValues, false));
        sorting.printData(sorting.splitAndMerge(mergeValues, true));

        int[] quickSortValues = {5,4,2,1,3,6,9,10,11,15,12,15,9,8,7};
        sorting.quickSort(quickSortValues, 0, quickSortValues.length-1, false, true);
        sorting.printData(quickSortValues);
        sorting.quickSort(quickSortValues, 0, quickSortValues.length-1, true, false);
        sorting.printData(quickSortValues);

    }

    private void printData(int[] values) {
        for (int value : values) {
            System.out.print(value);
        }
        System.out.println();
    }
}
