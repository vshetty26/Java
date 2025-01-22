// public class swap2{
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         System.out.println("Before Swapping");
//         System.out.println("a = "+a);
//         System.out.println("b = "+b);
//         int temp = a;
//         a = b;
//         b = temp;
//         System.out.println("After Swapping");
//         System.out.println("a = "+a);
//         System.out.println("b = "+b);
//         }
// }


//user input method
import java.util.Scanner;

public class swap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}