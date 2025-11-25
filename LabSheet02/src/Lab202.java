import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat frm = new DecimalFormat("#,###");
        System.out.print("Enter number 1: " );
        double numone = Integer.parseInt(scan.next());
        scan.nextLine();
        System.out.print("Enter number 2: " );
        double numtwo = Integer.parseInt(scan.next());
        System.out.print("\n\nSummation = " + frm.format(numone+numtwo));
        System.out.print("\nSubtraction = " + frm.format(numone-numtwo));
        System.out.print("\nMultiplication = " + frm.format(numone*numtwo));

        System.out.print("\nOivision = " + (numone/numtwo));
        System.out.print("\nModulus = " + frm.format(numone%numtwo));
    }
}
