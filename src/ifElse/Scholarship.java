package ifElse;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = in.nextLine();
        System.out.println("Please enter your age:");
        int age = in.nextInt();
        System.out.println("Please enter your mark:");
        double marks = in.nextDouble();

        if (age>=17 && age<=21 && marks>=80){
            //if (marks<=80){
                System.out.println(name+" is eligible");
            /*}
            else {
                System.out.println(name+" is NOT eligible");
            }*/
        }
        else {
            System.out.println(name+" is NOT eligible");
        }
    }
}
