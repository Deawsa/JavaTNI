import javax.swing.*;
import java.lang.constant.Constable;

public class Lab403 {
    static void main() {
       final String PASSWORD =  "Admin1234";
        final String USERNAME =  "Admin";
        String pass = "";
        String name = "";



        while(true){


            name = JOptionPane.showInputDialog("Enter username:");
            pass = JOptionPane.showInputDialog("Enter password:");


            name = name.substring(0, 1).toUpperCase() + name.substring(1,5).toLowerCase();


            if(name.equals(USERNAME) && pass.equals(PASSWORD)){

                   JOptionPane.showMessageDialog(null,"Login Success!!");
                   break;



            }else {

                JOptionPane.showMessageDialog(null,"Login Fail...",
                        "Incorrect username or password",JOptionPane.WARNING_MESSAGE);

            }

            JOptionPane.showMessageDialog(null,name);




        }




    }
}
