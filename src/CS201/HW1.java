package CS201;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {

        System.out.println("Enter a string to how it looks in reverse form");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        // for Method
        int a = 1;

        for (int i = str.length(); i > 0; i--) {

            System.out.print(str.substring(str.length() - a, i));
            a++;

        }
        //Creating a new line to see the result of both of them more clearly.
        System.out.println();


        // while Method
        int i = 0;
        int b = 1;
        while (i<str.length()){
            System.out.print(str.substring(str.length() - b, str.length() - i));
            i++;
            b++;
        }

    }
}
