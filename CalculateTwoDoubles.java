import javax.swing.JOptionPane;

public class CalculateTwoDoubles {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog(
                null,
                "Enter the first double number:",
                "First Number",
                JOptionPane.INFORMATION_MESSAGE
        );
        double num1 = Double.parseDouble(strNum1);

        String strNum2 = JOptionPane.showInputDialog(
                null,
                "Enter the second double number:",
                "Second Number",
                JOptionPane.INFORMATION_MESSAGE
        );
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        String divisionResult;

        if (num2 == 0) {
            divisionResult = "Cannot divide by zero!";
        } else {
            double quotient = num1 / num2;
            divisionResult = String.valueOf(quotient);
        }

        String message = "You entered: " + num1 + " and " + num2 + "\n"
                + "Sum (num1 + num2): " + sum + "\n"
                + "Difference (num1 - num2): " + difference + "\n"
                + "Product (num1 * num2): " + product + "\n"
                + "Quotient (num1 / num2): " + divisionResult;

        JOptionPane.showMessageDialog(
                null,
                message,
                "Calculation Results",
                JOptionPane.INFORMATION_MESSAGE
        );

        System.exit(0);
    }
}
