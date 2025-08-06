package javabasic_02.day11.test.class03;

public class Account {
    private String accNo;
    private int balance;

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public void save(int money) {
        balance += money;
        System.out.println(accNo + " 계좌에 " + money + "만원이 입금되었습니다.");
    }

    public void deposit(int money) {
        if (balance >= money) {
            balance -= money;
            System.out.println(accNo + " 계좌에 " + money + "만원이 출금되었습니다.");
        } else {
            System.out.println("잔고가 부족합니다.");
        }
    }

    public String getAccNo() {
        return accNo;
    }

    public int getBalance() {
        return balance;
    }
}
