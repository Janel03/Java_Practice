package ifElse;

import java.util.Scanner;
public class TriangleRightOrIsosceles {
    public static void main(String[] args) {
        //check if a triangle is a right angle or isosceles triangle

        Scanner in=new Scanner(System.in);
        System.out.println("Please enter the first side:");
        int a=in.nextInt();
        System.out.println("Please enter the second side:");
        int b=in.nextInt();
        System.out.println("Please enter the third side:");
        int c=in.nextInt();

        //check if the triangle is right angled
        if (c==Math.sqrt(Math.pow(a,2)+Math.pow(b,2))){
            System.out.println("the triangle is right angled");
        }
        //check if the triangle is isosceles
        if (a==b || b==c || a==c){
            System.out.println("the triangle is isosceles");
        }
        else {
            System.out.println("the triangle is not of known type");
        }
    }
}
