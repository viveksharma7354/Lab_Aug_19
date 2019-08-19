package question6;

/*
 * @author Vivek Sharma
 * @version 1.0
 */

import java.util.Scanner;


public class Question6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String na = s.nextLine();
        char[] c = na.toCharArray();
        if (Character.toLowerCase(c[0]) < Character.toLowerCase(c[2]))
            System.out.println(c[0] + " " + c[2]);
        else
            System.out.println(c[2] + " " + c[0]);
        s.close();
    }
}
