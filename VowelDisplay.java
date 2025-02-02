import java.util.Scanner;

class VowelFinder {
    void findVowels(String str) {
        for (char c : str.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                System.out.print(c + " ");
            }
        }
    }
}

public class VowelDisplay extends VowelFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new VowelDisplay().findVowels(sc.nextLine());
    }
}

