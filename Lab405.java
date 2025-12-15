import java.util.Scanner;

public class Lab405 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        String sentent = "";
        System.out.print("Input some sentence: ");
        sentent = scan.nextLine();
        while (true) {

            if (sentent.endsWith(".")) {

                break;

            }
            System.out.print("The sentence must end with full stop point: ");
            sentent = scan.nextLine();


        }
        String[] words = sentent.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
