public class simpleinterest {

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        double principal = 10000;
        double rate = 5;
        double time = 3;
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest is: " + simpleInterest);
    }
}
