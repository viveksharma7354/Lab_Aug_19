package question2;
/*
 * @author Vivek Sharma
 * @version 1.0
 */

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] arr;
        arr = s.nextLine().split(" ");
        String name = arr[0];
        String place = arr[1];
        System.out.println(name + " University " + place);
        s.close();
    }
}