import javax.swing.*;

public class Lab401 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your full name:");
        name = name.trim();
        String[] part = name.split(" ");

        while (part.length < 2) {
            name = JOptionPane.showInputDialog("Enter your full name:");
            part = name.split(" ");
            if (name == null) break;
        }

        String RealName = part[0];
        String LastName = part[part.length - 1].toUpperCase();
        String FirstCharAtRealName = RealName.substring(0,1).toUpperCase() + RealName.substring(1);

        if (part.length > 2) {
            String middle = "";
            for (int i = 1; i < part.length - 1; i++) {
                middle += part[i].toUpperCase();
            }

            JOptionPane.showMessageDialog(null, "Welcome, " + FirstCharAtRealName + " " +
                    middle + " " + LastName);
        }
        else {
            JOptionPane.showMessageDialog(null, "Welcome, " + FirstCharAtRealName + " " +
                    LastName);
        }


    }
}