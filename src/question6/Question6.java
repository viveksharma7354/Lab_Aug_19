package question6;

/*
 * @author Vivek Sharma
 * @version 1.0
 */

import java.util.Scanner;


public class Question6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        char b = s.next().charAt(0);
        if (Character.toLowerCase(a) < Character.toLowerCase(b))
            System.out.println(a + " " + b);
        else
            System.out.println(b + " " + a);
        s.close();
    }
}
