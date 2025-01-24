public class Check_no {
    public static void main(String[] args) {
        int number = -10;
        checkNumber(number);
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println(number + " is zero.");
        }
    }
}