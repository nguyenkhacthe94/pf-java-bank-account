public class AccountInfo {
    public static void main(String[] args) {
        Account account = new Account();
        account.setId(1122);
        account.setAnnualInterestRate(4.5);
        account.deposit(20000);
        account.withdraw(25000);

    }
}
