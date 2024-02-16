package access;

public class BankAccount {
    private int balance;

    // public method: deposit
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
            return;
        }

        System.out.println("유효하지 않은 금액입니다.");
    }

    // public method: withdraw
    public void withdraw(int amount) {
        if (!isAmountValid(amount)) {
            System.out.println("유효하지 않은 금액입니다.");
            return;
        }
        if (balance - amount < 0) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        balance -= amount;
    }

    //public method: getBalance
    public int getBalance() {
        return balance;
    }

    // private method: isAmountValid
    private boolean isAmountValid(int amount) {
        return amount > 0;  // 금액이 0보다 커야함
    }
}
