package ifElse;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        /*Check if the nth power of a number is even or not
        * (take the number & the power as input*/

        Scanner in=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num= in.nextInt();
        System.out.println("Please enter a power:");
        int p= in.nextInt();

        double result=Math.pow(num,p);

        if (result%2==0){
            System.out.println("result is even");
        }
        else {
            System.out.println("result is odd");
        }
    }
}
