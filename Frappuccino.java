package Drink;

public class Frappuccino extends Drink{
    private boolean whipped;
    public Frappuccino (String size,boolean whipped){
        super("Frappuccino",40,size);
        this.whipped = whipped;

    }
    public double calculateFinalPrice() {

        return getBasePrice() + getSizeExtra() + (whipped ? +15 : +0);
    }
    public String toString(){
        return super.toString() + (whipped? "\nAdded wipped 15 Baht ":" ")+"\nTotal price = " + calculateFinalPrice() + " Baht";

    }




}