import java.util.Scanner;

public class Lab308 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max=0,min=0,even=0,odd = 0;

        System.out.print("How many number to input: ");
        int loop = scanner.nextInt();
        for(int i = 1;i<=loop;i++){
            System.out.print("Enter number "+i+": ");
            int num = scanner.nextInt();
             if (num%2==0) {
                even+=1;

            }else if (num%2!=0) {
                odd += 1;
            }
             if(num > max){
                max = num;
            }if (num < min) {
                min = num;
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
        System.out.println("Even number = "+even);
        System.out.println("Odd  number = "+odd);
    }
}
