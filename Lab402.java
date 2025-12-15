import javax.swing.*;

public class Lab402 {
    static void main() {

        String stuid = "";
        int i = 1;
        String major = "" ;



        while(stuid.length() != 10 ){


            stuid = JOptionPane.showInputDialog("Enter student-id:");

            if(stuid.substring(2,5).equals("131")) {

                major ="Information Technology (IT)";

            }else if (stuid.substring(2,5).equals("132")) {

                major ="Multimedia Technology (MT)";

            }else if(stuid.substring(2,5).equals("133")) {

                major ="Digital Business Information Technology (BI)";

            }else if(stuid.substring(2,5).equals("134")) {

                major ="Digital Technology in Mass Communication (DC)";

            }else if(stuid.substring(2,5).equals("135")) {

                major ="Data Science and Data Analytics (DS)";

            }else{

                 major="Cannot found major";

            }


            }


        JOptionPane.showMessageDialog(null,"Student ID: "+stuid + "\nMajor: "+major);



         }
}


