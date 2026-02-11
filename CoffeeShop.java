package Drink;

import java.util.Scanner;

public class CoffeeShop  {
    public static Espresso orderEspresso(){



        int shot = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size: ");
        String size = scanner.nextLine();

        Espresso order1 = new Espresso(size);
        System.out.print("Press 'y' or 'Y' for adding a shot: ");
        String confirm = scanner.nextLine();
        if(confirm.equals("Y")||confirm.equals("y")){
            System.out.print("How many shorts for adding in Espresso: ");
            shot = scanner.nextInt();
            order1.addShot(shot);

        }
        return order1;

    }
    public static Frappuccino orderFrappuccino(){

        boolean whipped;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size: ");
        String size = scanner.nextLine();
        System.out.print("Do you would like to add whipped cream [y/Y]? ");
        String confirm = scanner.nextLine();
        if(confirm.equals("Y")||confirm.equals("y")){
            whipped = true;
        }else whipped = false;
        Frappuccino order2 = new Frappuccino(size,whipped);
        return order2;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int order1 = 0;
        int order2 = 0;
        int confirm =0;
       double totalprice = 0;

        String sure ="";
        while (true) {
            System.out.println("Press 1 for ordering Espresso");
            System.out.println("Press 2 for ordering Frappuccino");
            System.out.print("Enter an option: ");
            confirm = scanner.nextInt();
            if (confirm==1){
                Espresso orderEspresso = orderEspresso();
                System.out.println(orderEspresso);
                order1++;
                totalprice += orderEspresso.calculateFinalPrice();
            }else {
                order2++;
                Frappuccino orderFrappuccino = orderFrappuccino();
                System.out.println(orderFrappuccino);
                totalprice += orderFrappuccino.calculateFinalPrice();
            }
            System.out.print("\nDo yu want to order more [y/Y]? ");
            sure = scanner.next();
            if (!sure.equalsIgnoreCase("Y")) {
                break;

            }
            System.out.print("\n");
            }
        System.out.print("\n"+"You ordered " + order1 + " Espresso");
        System.out.print("\n"+"You ordered " + order2 + " Frappuccino");
        System.out.print("\nTotal Price = " + totalprice);{


        }
    }
}

