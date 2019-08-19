package question7;

/*
 * @author Vivek Sharma
 * @version 1.0
 */

import java.util.Scanner;


public class Question7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);

        if (((int) a >= 65 && (int) a <= 90) || ((int) a >= 97 && (int) a <= 122)) {
            System.out.println("alphabet");
        } else if ((int) a >= 48 && (int) a <= 57) {
            System.out.println("digit");
        } else {
            System.out.println("special character");
        }
    }
}
