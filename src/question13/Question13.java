package question13;

/*
 * @author Vivek Sharma
 * @version 1.0
 */


import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int sum = 0;
        for (; a != 0; ) {
            int r = a % 10;
            sum = sum + r;
            a = a / 10;
        }
        System.out.println(sum);
    }
}
