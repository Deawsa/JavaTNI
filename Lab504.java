import java.util.Scanner;

public class Lab504 {
    public static boolean check_password(String pass){

            return pass.length() < 8;

    }
    public static boolean check_password(String pass,String confirm_pass){

        return !pass.equals(confirm_pass);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Create password: ");
        String password = scan.nextLine();
        while(check_password(password)){

            System.out.print("Invalid Password! Create password: ");
            password = scan.nextLine();


        }

        System.out.print("\n");
        System.out.print("Enter confirm password: ");
        String confirm_pass = scan.nextLine();
        while (check_password(password,confirm_pass)){

            System.out.print("Password do not match!Enter confirm password: ");
            confirm_pass = scan.nextLine();


        }
        System.out.print("\n");
        System.out.println("Password set successfully!!");
    }
}
