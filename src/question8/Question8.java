package question8;

/*
 * @author Vivek Sharma
 * @version 1.0
 */

import java.util.Scanner;


public class Question8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        int b = s.nextInt();
        if ((a.equals("male") || a.equals("Male")) && (b >= 1 && b <= 58)) {
            System.out.println("8.4%");
        } else if ((a.equals("male") || a.equals("Male")) && (b >= 59 && b <= 100)) {
            System.out.println("10.5%");
        } else if ((a.equals("female") || a.equals("Female")) && (b >= 1 && b <= 58)) {
            System.out.println("8.2%");
        } else if ((a.equals("female") || a.equals("Female")) && (b >= 59 && b <= 100)) {
            System.out.println("9.2%");
        }
    }
}
