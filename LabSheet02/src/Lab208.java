import javax.swing.*;
import java.text.DecimalFormat;

public class Lab208 {
    public static void main(String[] args) {
        final double PRICE = 7.50;
        final double TAX = 0.15;
       JOptionPane.showMessageDialog(null,"Welcome to the payroll application" );
        String name = JOptionPane.showInputDialog("Enter employee name:" );
        int hour = Integer.parseInt(JOptionPane.showInputDialog("Enter total hour for this employee" ));

        DecimalFormat frm = new DecimalFormat("#,###.00");
        double money = PRICE*hour;
        double tax = money*TAX;
        double realmoney = money - tax;
    JOptionPane.showMessageDialog(null,"Employee name: "+name+
                "\nHour worked: "+hour+
                "\nHourly wage: $"+frm.format(PRICE)+
                "\nGross earnings: $" +frm.format(money)+
                "\nTax rate: "+TAX+
                "\nTax: $"+frm.format(tax)+
                "\nNet earnings: $"+frm.format(realmoney));
    }
}
