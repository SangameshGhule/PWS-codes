package Pattern.Traingle;

import java.util.Scanner;

public class NumberTraingle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int a = sc.nextInt();
        int b = 1;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(b+" ");
                b++;
            }
            System.out.println();
        }
    }
}
