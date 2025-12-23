import java.util.Scanner;

public class Lab604 {
    public static void display_array(int[] numbers){

        System.out.print("List of numbers in array: ");
        for(int i =0;i<numbers.length;i++){

            System.out.print(numbers[i]+" ");
        }


    }public static int input_index(int[] numbers){

        int num;

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter index: ");
        num = scanner.nextInt();

        while(check_index(numbers,num)){

            System.out.print("Invalid index!! Enter index: ");
            num = scanner.nextInt();
        }

        return num;
    }public static boolean check_index(int[] numbers,int index){

        if(index<0||index>numbers.length-1){

            return true;

        }

        return false;

    }

    public static void main(String[] args) {
        int[] numbers = {47,13,82,17,61,29,94,36};
        display_array(numbers);
        int num = input_index(numbers);
        System.out.println("\n\nThe number at index " + input_index(numbers) + " is "+ numbers[input_index(numbers)]);



    }
}
