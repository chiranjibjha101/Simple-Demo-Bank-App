import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter name,password,balance to create your account");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String password=sc.next();
        double balance=sc.nextDouble();
        bankUser sbi=new bankUser(name,balance,password);
        ///add money
        String message= sbi.addMoney(sc.nextInt());
        System.out.println(message);

        //withdraw money
        System.out.println("enter amount");
        int amount=sc.nextInt();
        System.out.println("enter password");
        String pass= sc.nextLine();
        sbi.withdrawMoney(amount,pass);

        //interest
        System.out.println(sbi.calculateIntrest(sc.nextInt()));


    }
}