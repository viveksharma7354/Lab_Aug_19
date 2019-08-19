package question14;

/*
 * @author Vivek Sharma
 * @version 1.0
 */


import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int k = a;
        int d = 0;
        for (; a != 0; ) {
            int r = a % 10;
            d = (d * 10) + r;
            a = a / 10;
        }
        if (k == d)
            System.out.println(k + " is a palindrome.");
        else
            System.out.println(k + " is not a palindrome.");
        s.close();
    }
}