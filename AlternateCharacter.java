import java.util.Scanner;

class AlternateChar {
    void displayAlternate(String str) {
        for (int i = 0; i < str.length(); i += 2) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}

public class AlternateCharacter extends AlternateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new AlternateCharacter().displayAlternate(sc.nextLine());
    }
}
 