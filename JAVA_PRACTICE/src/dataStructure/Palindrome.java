package dataStructure;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome");
        int n = in.nextInt();
        int temp=n;
        int sum = 0;
        while(n>0){
            int r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}
