import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;

public class StringReverseApp extends JFrame {
    private JTextField inputField;
    private JLabel resultLabel;

    public StringReverseApp() {
        setTitle("String Reversal App");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel instructionLabel = new JLabel("Enter a string:");
        inputField = new JTextField(20);
        JButton reverseButton = new JButton("Reverse");
        resultLabel = new JLabel("Reversed string will appear here");

        add(instructionLabel);
        add(inputField);
        add(reverseButton);
        add(resultLabel);

        reverseButton.addActionListener(e -> reverseString());
    }

    private void reverseString() {
        String input = inputField.getText();
        if (!input.isEmpty()) {
            String reversed = new StringBuilder(input).reverse().toString();
            resultLabel.setText("Reversed: " + reversed);
        } else {
            resultLabel.setText("Please enter a string");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StringReverseApp app = new StringReverseApp();
            app.setLocationRelativeTo(null);
            app.setVisible(true);
        });
    }
}