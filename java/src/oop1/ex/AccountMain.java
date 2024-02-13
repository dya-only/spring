package oop1;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);  // 잔액 부족 출력

        System.out.println("잔고: " + account.balance);
    }
}
