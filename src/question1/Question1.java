package question1;
/*
 * @author Vivek Sharma
 * @version 1.0
 */

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine().trim();
        System.out.println("Welcome, " + name + "!");
        s.close();
    }
}