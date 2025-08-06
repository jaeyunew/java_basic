package javabasic_02.day10.morningTest;

public class Account {
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;
    private int balance;
    private String name;
    private String number;

    public Account(String number, String name, int balance){
        this.number=number;
        this.name=name;
        this.balance=balance;
    }

    public void setBalance(int balance) {
        if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
            this.balance += balance;
        }else {
            return;
        }

    }

    public String getNumber() {
        return number;
    }

    public  String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
}
