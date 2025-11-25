import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class EX203 {
    public static void main(String[] args) {
        final double LECTURE_PRICE = 1900;
        final double LAB_PRICE = 3500;
        int lecture_credit = Integer.parseInt(JOptionPane.showInputDialog("Enter lecture credit:"));
        int lab_credit = Integer.parseInt(JOptionPane.showInputDialog("Enter lecture credit:"));
        double totallec = LECTURE_PRICE*lecture_credit;
        double totallab = LAB_PRICE*lab_credit;
        double total = totallab+totallec;
        DecimalFormat frm = new DecimalFormat("#,###.00");
        JOptionPane.showMessageDialog(null,"Lecture: "+lecture_credit+"x"+LECTURE_PRICE+"="+frm.format(totallec)+
                "\nLaboratory: "+lab_credit+"x"+LAB_PRICE+"="+frm.format(totallab)+
                "\nTotal price: "+frm.format(total));
    }
}
