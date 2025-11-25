import javax.swing.*;


public class Lab205 {
    public static void main(String[] args) {

        final int REALMINUTES = 60;
        int hour = 0;


        int minutes = Integer.parseInt(JOptionPane.showInputDialog("Input minute: " ));

        int newhour = hour*REALMINUTES;
        int allminutes = newhour+minutes;
        int realhour = minutes/REALMINUTES + hour;
        int realminutes = minutes%REALMINUTES;
        JOptionPane.showMessageDialog(null,allminutes+" minutes is "+realhour+" hour "+realminutes+" minutes");
    }
}
