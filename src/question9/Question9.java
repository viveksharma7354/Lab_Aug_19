package question9;

/*
 * @author Vivek Sharma
 * @version 1.0
 */

import java.util.Scanner;


public class Question9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);

        if (((int) a >= 65 && (int) a <= 90)) {
            System.out.println((char) ((int) a + 32));
        } else if (((int) a >= 97 && (int) a <= 122)) {
            System.out.println((char) ((int) a - 32));
        } else {
            System.out.println("Invalid character");
        }
    }
}
