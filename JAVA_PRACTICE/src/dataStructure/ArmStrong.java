package dataStructure;

public class ArmStrong {
    public static void main(String[] args) {

        int number = 371;
        int n = String.valueOf(number).length();
        int result = 0;
        int originalNumber = number;

        while (originalNumber != 0) {
            int r = n % 10;  //getting remainder
            result += Math.pow(r, n);
            n = n / 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
