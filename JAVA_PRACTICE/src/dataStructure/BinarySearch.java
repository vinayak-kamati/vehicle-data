package dataStructure;

import java.util.Scanner;

public class BinarySearch {

    private static void binarySearch(int[] array, int n, int key) {
        int first = 0;
        int last = array.length;
        int mid = (first + last)/2;
        while (first <= last){
            if(array[mid] == key){
                System.out.println("element found at "+mid);
                break;
            } else if(array[mid] < key ){
                first = mid;
            }else if(array[mid] > key){
                last = mid;
            }
            mid = (first + last)/2;
        }
        System.out.println("element not found");

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to search");
        int key = sc.nextInt();
        binarySearch(array,n,key);
    }
}
