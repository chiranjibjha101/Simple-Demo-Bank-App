public interface bank {
    double checkBalance();
    String addMoney(int amount);
    String withdrawMoney(int amount,String password);
    double calculateIntrest(int years);
}
