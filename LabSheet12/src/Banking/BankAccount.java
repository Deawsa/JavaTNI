package Banking;

public class BankAccount {
    private String accID;
    private double accBalance;
    private final String filename =  "src/Banking/users_account.txt";

    public BankAccount(String accID, double accBalance){
        this.accID = accID;
        this.accBalance = accBalance;

    }

    public BankAccount(String accID){
        this.accID = accID;

    }

    public BankAccount(){

    }

    public String getAccid(){

        return this.accID;

    }

    public void setAccBalance(double accBalance){

    }
}
