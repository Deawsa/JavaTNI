import javax.swing.*;

public class Lab302 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height(cm.):"));
        int male = JOptionPane.showConfirmDialog(null,"Are you biological gender is Male?","Gender",JOptionPane.YES_NO_OPTION);
        if(male ==0 ){




            JOptionPane.showMessageDialog(null,"Hello, Mr." + name + "\nif your hieght is " + height +" cm."
                    + "\nYour weight should be " + (height-100) + " kg.");

        }
        else {
            int female = JOptionPane.showConfirmDialog(null,"Are you biological gender is Female?","Gender",JOptionPane.YES_NO_OPTION);
            if(female ==0 ){




                JOptionPane.showMessageDialog(null,"Hello, Mr." + name + "\nif your hieght is " + height +" cm."
                        + "\nYour weight should be " + (height-110) + " kg.");

            }else {
                JOptionPane.showMessageDialog(null, "You can use BMI to measure your weight and height.");
            }
        }
    }
}
