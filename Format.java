import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Format {

    public static void main(String[] args) {
        //DecimalFormat() method
        double number = 23.39483;
        double number2 = 23022.39483;
        double number3= 200.39483;

        DecimalFormat formatter = new DecimalFormat("#.0");
        JOptionPane.showMessageDialog(null, formatter.format(number));
        JOptionPane.showMessageDialog(null, formatter.format(number2));
        JOptionPane.showMessageDialog(null, formatter.format(number3));


    }
}
