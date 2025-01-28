import java.util.Scanner;
public class gradingsysuserinput {

    public static String getGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the score: ");
        int score = sc.nextInt();
        
        String grade = getGrade(score);
        System.out.println("Score: " + score + " - Grade: " + grade);
    }
}
    
