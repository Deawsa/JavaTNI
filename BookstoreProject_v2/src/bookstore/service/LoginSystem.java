package bookstore.service;

import bookstore.model.Employee;
import javax.swing.*;
import java.util.ArrayList;

public class LoginSystem {

    public static boolean login(ArrayList<Employee> employees) {

        String username = JOptionPane.showInputDialog("Username:");
        if (username == null) return false;

        Employee found = null;

        for (Employee e : employees) {
            if (e.getUsername().equals(username)) {
                found = e;
                break;
            }
        }

        if (found == null) {
            JOptionPane.showMessageDialog(null, "Invalid Username");
            return false;
        }

        String password = JOptionPane.showInputDialog("Password:");
        if (password == null) return false;

        if (!found.getPassword().equals(password)) {
            JOptionPane.showMessageDialog(null, "Invalid Password");
            return false;
        }

        return true;
    }
}
