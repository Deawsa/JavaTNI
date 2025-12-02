import javax.swing.*;

public class Lab307 {
    public static void main(String[] args) {
        double total_price = 0;
        double price = 0;
         Boolean hi = true;
        while(hi){
             price = Double.parseDouble(JOptionPane.showInputDialog("Input price [press 0 to stop]:"));
            if(price < 0){
                price = Double.parseDouble(JOptionPane.showInputDialog("Invalid price!!" +
                        "\nInput price [press 0 to stop]"));
                total_price=total_price + price;
            }else if(price == 0) {
                hi = false;
            }
            else {

                total_price=total_price + price;
            }
        }JOptionPane.showMessageDialog(null,"Total price is " + total_price + "bath.");
    }
}
