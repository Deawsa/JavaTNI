import java.util.Scanner;

public class Ex202 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter student-id  : " );
        String id = scan.next();
        scan.nextLine();
        System.out.print("Enter student name: " );
        String name = scan.nextLine();
        System.out.print("\n\nstudent-id  : " + id );
        System.out.print("\nstudent name: " + name );
    }
}
