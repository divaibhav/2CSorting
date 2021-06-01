package bubblesort;

import java.util.Arrays;

public class MyBubbleSort {
    public static void main(String[] args) {
        int[] arr = {100,80,60,40,20};
        MyBubbleSort obj = new MyBubbleSort();
        obj.bubbleSort(arr);
        System.out.println("final sorted => " + Arrays.toString(arr));
    }
    public void bubbleSort(int[] arr){
        int count = 0 ;
        //step 1
        for (int i = 0; i < arr.length; i++) {
            //step 2
            for (int j = 0; j < arr.length - 1; j++) {
                //step 3
                if(arr[j] > arr[j+1]){
                    //step 3.1 swap
                    count++;
                    System.out.println("swapping --> " + arr[j] + " and  --> " + arr[j+1] );
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
        System.out.println("swapping count = " + count);
    }
}
