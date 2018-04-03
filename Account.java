import java.util.Date;
import java.util.Scanner;

public class Account {
    Scanner input = new Scanner(System.in);
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        double montlyInterestedRate = (annualInterestRate * 100) / 12;
        return montlyInterestedRate;
    }

    public double getMonthlyInterest() {
        double monthlyInterest = balance * getMonthlyInterestRate();
        return monthlyInterest;
    }

    public void withdraw(double withdrawFund) {
        System.out.print("Enter withdraw fund: ");
        withdrawFund = input.nextDouble();
        balance = balance * getMonthlyInterest() - withdrawFund;
    }

    public void deposit(double depositFund) {
        System.out.print("Enter deposit fund: ");
        depositFund = input.nextDouble();
        balance = balance * getMonthlyInterest() + depositFund;
    }

}
