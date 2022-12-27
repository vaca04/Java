import javax.swing.JOptionPane;

public class DataInputAndOutputWithJOptionPane {
    public static void main(String[] args) {
        String chain;
        int number;
        char character;
        double decimal;
        chain = JOptionPane.showInputDialog("Typing a chain:");
        number = Integer.parseInt(JOptionPane.showInputDialog("Typing a number:"));
        character = JOptionPane.showInputDialog("Typing a character:").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Typing a decimal:"));
        JOptionPane.showMessageDialog(null, "The chain is: " + chain);
        JOptionPane.showMessageDialog(null, "The number is: " + number);
        JOptionPane.showMessageDialog(null, "The character is: " + character);
        JOptionPane.showMessageDialog(null, "The decimal is: " + decimal);
    }
}