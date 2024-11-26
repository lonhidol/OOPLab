import javax.swing.JOptionPane;
public class CalculateTwoNumbers {
    public static void main(String[] args){
    String strNum1 = JOptionPane.showInputDialog(null, "Please input the first number:", "Input", JOptionPane.INFORMATION_MESSAGE);
    String strNum2 = JOptionPane.showInputDialog(null, "Please input the second number:", "Input", JOptionPane.INFORMATION_MESSAGE);
    double Num1 = Double.parseDouble(strNum1);
    double Num2 = Double.parseDouble(strNum2);
    double Sum = Num1 + Num2;
    double Differecne = Num1 - Num2;
    double Product = Num1 * Num2;
    double quotient = 0;
    if ( Num2 != 0){
        quotient = Num1/Num2;
    } else {
        JOptionPane.showMessageDialog(null, "Division by zero is not allowed.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    String result = "Sum: " + Sum +
                    "\nDifference: " + Differecne +
                    "\nProduct: " + Product +
                    "\nquotient: " + quotient;
    JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
}}