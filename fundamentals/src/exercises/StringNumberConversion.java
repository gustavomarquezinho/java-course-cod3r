 /*
 * Title: String Number Conversion
 * Section: 03 
 * Lecture: 37
 */

package exercises;

import javax.swing.JOptionPane;

public class StringNumberConversion {
    public static void main(String[] args) {
        // Number To String #1
        Integer number1 = 1000;
        System.out.println(number1.toString());

        // Number To String #2
        int number2 = 10000;
        System.out.println(Integer.toString(number2));

        // Number To String #3
        int number3 = 10000;
        System.out.println("" + number3);

        // String To Number #1
        String string1 = JOptionPane.showInputDialog(
                "Digite o primeiro número: ");

        String string2 = JOptionPane.showInputDialog(
                "Digite o segundo número: ");

        System.out.println(Double.parseDouble(string1));
        System.out.println(Double.parseDouble(string2));
    }
}
