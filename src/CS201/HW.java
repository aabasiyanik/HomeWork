package CS201;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {

        System.out.println("How many numbers would you like");
        Scanner input = new Scanner(System.in);
        int uInput = input.nextInt();
        for (int i = 1; i <= uInput; i++) {
            int a = 1;
            for (int j = 0; j < i; j++) {
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}
