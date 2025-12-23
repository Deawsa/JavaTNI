import java.util.Scanner;

public class Lab601 {
    public static void main(String[] args) {


        int[] numbers = new int[5];
        int j=1;
        int x = 0;
        int y = 0;
        int[] even_number = new int[5];
        int[] odd_number = new int[5];

        for(int i = 0;i<numbers.length;i++){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number " + j+": " );
            numbers[i]= scanner.nextInt();
            j++;
            if(numbers[i]<1){
                while(numbers[i]<1) {

                    System.out.print("The number must be positive! Enter number again: ");
                    numbers[i] = scanner.nextInt();
                }
            }
            if(numbers[i]%2 == 0){

                even_number[x] = numbers[i];
                x++;


            }else {

                odd_number[y] = numbers[i];
                y++;

            }

        }

        System.out.print("\n\nList of even number: ");
        for(int i = 0;i<numbers.length;i++) {
            if (numbers[i] % 2 == 0) {

                System.out.print(numbers[i] + " ");

            }
        }
        System.out.print("\nList of odd  number: ");
        for(int i = 0;i<numbers.length;i++) {
            if (numbers[i] % 2 != 0) {

                System.out.print(numbers[i] + " ");

            }
        }

    }
}
