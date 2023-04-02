import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.println(search());
//        armstrong();
        pattern();
    }

    public static int search(){
        System.out.println("Enter a number to find out index of that value");
        int input = new Scanner(System.in).nextInt();

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,70,80,90));
        int i = list.indexOf(3);
        System.out.println(list);
        int low = 0;
        int high = list.size()-1;
        while (low<=high){
            int mid = (low + high)/2;
            if (list.get(mid) == input){
                return mid;
            } else if (list.get(mid)< input) {
                low += 1;
            }
            else if(list.get(mid)>input){
                high -= 1;
            }
        }
        return -1;
    }

    public static void armstrong(){
        long input = new Scanner(System.in).nextInt();
        long orgInput = input;
        String val = String.valueOf(input);
        int size = val.length();
        long result = 0;
        while(orgInput != 0){
            long rm = orgInput % 10;
            result += Math.pow(rm,size);
            orgInput /= 10;
        }

        if (input == result){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not-Armstrong");
        }
    }

    public static void pattern(){
        int n = 4;
        char ch = 'A';
        for (int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
            ch++;
        }
    }
}