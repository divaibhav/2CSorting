package insertionsort;

import selectionsort.MySelectionSort;

import java.util.Arrays;

public class MyInsertionSort {
    public static void main(String[] args) {
        int[] arr = {12,8,16,5,2};
        System.out.println("unsorted -->" + Arrays.toString(arr));
        MyInsertionSort obj = new MyInsertionSort();
        obj.insertionSort(arr);
        System.out.println("sorted -->" + Arrays.toString(arr));
    }
    public void insertionSort(int[] arr){
        //step 1
        int sortedIndex = 0;
        int unsortedIndex = 1;
        //step 2
        for (int i = unsortedIndex; i < arr.length ; i++) {
            //step 3
            int nextElement = arr[i];
            System.out.println("nextElement = " + nextElement);
            //step 4
            for (int j = i; j > 0; j--) {
                //step 5
                if(arr[j] < arr[j-1]){
                    System.out.println("swapping --> " + arr[j] + " with --> " + arr[j-1]);
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
