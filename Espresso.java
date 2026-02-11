package Drink;

public class Espresso extends Drink {

    private int shot;
    public Espresso (String size){
        super("Espresso",35,size);
        this.shot = 0;
    }
    public void addShot(int shot){
        this.shot +=shot;
    }
    public int getShot(){
        return this.shot;
    }
    public double calculateFinalPrice(){
        if(getShot()>0){
            return getBasePrice()+getSizeExtra()+(15*getShot());
        }else  return getBasePrice()+getSizeExtra();

    }
    public String toString(){
        return super.toString() + (getShot()>0? "\nAdded " + getShot() + " shot ":" ")+"\nTotal price = " + calculateFinalPrice() + " Baht";

    }
}
