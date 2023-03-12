package Incapsulation_1;

import java.util.Scanner;

public class Customer {

    private double accountBalance;
    private String username;
    private String password;

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
        this.accountBalance = 0.0;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    private void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    // method to deposit money into the account
    public void deposit(double amount) {
        setAccountBalance(getAccountBalance() + amount);
        System.out.println("Successfully deposited " + amount + " into account.");
    }

    // method to withdraw money from the account
    public void withdraw(double amount, String password) {
        if (password.equals(this.password)) {
            if (getAccountBalance() >= amount) {
                setAccountBalance(getAccountBalance() - amount);
                System.out.println("Successfully withdrew " + amount + " from account.");
            } else {
                System.out.println("Insufficient funds in account.");
            }
        } else {
            System.out.println("Invalid password.");
        }
    }

    // main method for testing
    public static void main(String[] args) {


        Scanner read = new Scanner(System.in);

        System.out.println("enter the name of account holder");
        String name = read.nextLine();

        System.out.println("enter the password of account holder");
        String password = read.nextLine();

        Customer customer = new Customer(name, password);
        System.out.println("Initial account balance: " + customer.getAccountBalance());

        System.out.println("enter amount to deposit");
        customer.deposit(read.nextInt());
        System.out.println("New account balance: " + customer.getAccountBalance());


        System.out.println("Enter amount to withdraw");
        int amountToWithdraw = read.nextInt();


        System.out.println("Enter password");
        read.nextLine();
        String passwordToWidhdraw = read.nextLine();


        customer.withdraw(amountToWithdraw, passwordToWidhdraw);
        System.out.println("New account balance: " + customer.getAccountBalance());
    }
}
