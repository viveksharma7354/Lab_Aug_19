package question12;

/*
 * @author Vivek Sharma
 * @version 1.0
 */


import java.util.Scanner;


public class Question12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int c = 0;
        if (a == 1)
            System.out.println(a + " is not a prime number.");
        else {
            for (int i = 2; i <= a / 2; i++) {
                if (a % i == 0)
                    c++;
            }
            if (c == 0)
                System.out.println(a + " is a prime number.");
            else
                System.out.println(a + " is not a prime number.");
        }
        s.close();
    }
}
