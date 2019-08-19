package question2;
/*
 * @author Vivek Sharma
 * @version 1.0
 */

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.next().trim();
        String place = s.next().trim();
        System.out.println(name + " University " + place);
        s.close();
    }
}