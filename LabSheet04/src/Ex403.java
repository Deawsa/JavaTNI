import javax.swing.*;

public class Ex403 {
    public static void main(String[] args) {
        String email = JOptionPane.showInputDialog("Enter your email.");
        while (!email.endsWith("@gmail.com")){

            email = JOptionPane.showInputDialog("Please enter your email again.");


        }
JOptionPane.showMessageDialog(null,"Your email is " + email);

    }
}
