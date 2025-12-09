import java.util.Scanner;

public class Ex402 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the  first message: ");
        String message1 =  scan.nextLine();
        System.out.print("Enter the second message: ");
        String message2 =  scan.nextLine();
        System.out.print("\n\nSensitive comparison  : ");
        System.out.print((message1.equals(message2)) ? "Both message are the same" : "Both message are NOT the same");

    }
}
