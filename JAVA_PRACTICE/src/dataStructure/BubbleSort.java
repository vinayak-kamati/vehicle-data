package dataStructure;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] ={3,60,35,2,45,320,5};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));//sorting array elements using bubble sort

    }
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                if (arr[j] > arr[j+1]) {
                    //swap elements
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
    }
}
