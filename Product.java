import javax.swing.*;

public class Product {

    public String name;
    public double price = 0;
    public int quantity = 0;


    public void addStock(int amount){
        if(amount > 0){

            quantity += amount;
            System.out.println("\n\nAdded " + amount +" item to stock");

        }


    }
    public void sell(int amount){

        if(amount <= quantity){

            quantity-=amount;
            System.out.println("Sold " + amount +" item");

        }else {
            System.out.println("Not enough item in stock...");

        }


    }
    public void changePrice(double newPrice){

        if(newPrice > 0){
            price = newPrice;
            System.out.println("\n\nChange price to "+newPrice+" baht");
        }
    }
    public double stockValue(){

        return quantity*price;

    }
    public void showInfo(){
        System.out.println("Name  : "+name+
                           "\nPrice : "+price+" Baht/Item"+
                           "\nStock : "+quantity+" Items"+
                           "\nStock Value: "+stockValue()+" Baht");


    }
}
