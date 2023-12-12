package algorithms.sorting;

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

    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        int[] values = {5,4,2,1,3};

        sorting.bubbleSort(values, false);
        sorting.printData(values);

        sorting.bubbleSort(values, true);
        sorting.printData(values);

    }

    private void printData(int[] values) {
        for (int value : values) {
            System.out.print(value);
        }
        System.out.println();
    }
}
