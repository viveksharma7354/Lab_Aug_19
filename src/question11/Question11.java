package question11;

/*
 * @author Vivek Sharma
 * @version 1.0
 */

import java.util.Scanner;


public class Question11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (a <= b) {
            for (int i = a + 1; i < b; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + "\t");
                }
            }
        } else
            System.out.print("Invalid Range");
    }
}
