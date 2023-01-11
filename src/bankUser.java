import java.util.Objects;
import java.util.UUID;

public class bankUser implements bank{
    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private static double rateOfInterest;

    public bankUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.rateOfInterest=6.5;
        this.accountNo= String.valueOf(UUID.randomUUID());
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance+=amount;
        return "Balance="+balance;
    }

    @Override
    public String withdrawMoney(int amount, String enterPassword) {
        if(Objects.equals(enterPassword,password)){
            if(amount>balance){
                System.out.println("insufficient balance");
            }
            else{
                System.out.println("Success");
            }
        }
        else{
            return "wrong pass";
        }
        return null;
    }

    @Override
    public double calculateIntrest(int years) {
        return years*balance*rateOfInterest/100;
    }
}
