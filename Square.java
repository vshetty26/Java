// public class Square {
//     public static void main(String[] args) {
//         int num = 5;
//         int square = num * num;
//         System.out.println("Square of "+num+" is "+square);
//         }
//         }


//user input method
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        int square = num * num;

        System.out.println("Square of " + num + " is " + square);
    }
}