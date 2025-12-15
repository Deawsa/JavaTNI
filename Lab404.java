import java.util.Scanner;

public class Lab404 {
    static void main() {

        Scanner scan = new Scanner(System.in);
        String word = "";
        String sentent = "";

        while (true) {


            System.out.print("Enter word: ");
             word = scan.nextLine();

            word = word.toLowerCase();

            if (word.equals("stop")) {

                System.out.print(sentent);
                break;


            }
            sentent+=word+" ";


        }






    }


}



