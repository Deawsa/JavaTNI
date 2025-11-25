import java.util.Scanner;

public class Lab204 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int REALMINUTES = 60;
        System.out.print("Input hour : " );
        int hour = Integer.parseInt(scan.next());
        scan.nextLine();
        System.out.print("Input minute: " );
        int minutes = Integer.parseInt(scan.next());
        int newhour = hour*REALMINUTES;
        int allminutes = newhour+minutes;
        System.out.print("Total time is " + allminutes + " minutes" );

    }
}
