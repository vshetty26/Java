class Alphabet {
    void display() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
    }
}

public class AlphabetDisplay extends Alphabet {
    public static void main(String[] args) {
        new AlphabetDisplay().display();
    }
}
 