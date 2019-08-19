package question5;

/*
 * @author Vivek Sharma
 * @version 1.0
 */

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
