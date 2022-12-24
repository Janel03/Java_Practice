package ifElse;
import java.util.Scanner;
public class UpperOrLowerCase {
    public static void main(String[] args) {
        /*check if the alphabet entered by the user is an
        * uppercase character or lower case*/
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter an alphabet letter:");
        char ch=in.next().charAt(0);
        int ascii=(int)ch;

        if (ascii>=65 && ascii<=90){
            System.out.println("it's Upper case letter");
        }
        else if (ascii>=97 && ascii<=122){
            System.out.println("it's lower case letter");
        }
        else {
            System.out.println("the character is not an alphabet");
        }
    }
}
