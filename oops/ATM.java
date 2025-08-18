package oops;

public abstract class ATM {
  public abstract String bankName();
  public abstract int pin();
  public abstract double withdraw(int amount);
  public abstract double deposit(int amount);
  public double getBalance() {
    return 0; // Default implementation, can be overridden
  }
}
class ATMImpl extends ATM {
  private String bankName;
  private int pin;
  private double balance;

  public ATMImpl(String bankName, int pin, double initialBalance) {
    this.bankName = bankName;
    this.pin = pin;
    this.balance = initialBalance;
  }

  @Override
  public String bankName() {
    return bankName;
  }

  @Override
  public int pin() {
    return pin;
  }

  @Override
  public double withdraw(int amount) {
    System.out.println("Withdrawing: " + amount);
    if (amount > balance) {
      System.out.println("Insufficient funds");
      return balance;
    }
    balance -= amount;
    return balance;
  }

  @Override
  public double deposit(int amount) {
    System.out.println("Depositing: " + amount);
    balance += amount;
    return balance;
  }
  @Override
  public double getBalance() {
    return balance; // Return the current balance
  }
}
class ATMMain {
  public static void main(String[] args) {
    ATM atm = new ATMImpl("Bank of OOP", 1234, 1000.0);
    System.out.println("Welcome to " + atm.bankName());
    System.out.println("Your PIN is: " + atm.pin());
    System.out.println("Your current balance is: " + atm.getBalance());
    atm.deposit(1000);
    System.out.println("Your new balance is: " + atm.getBalance());
    atm.withdraw(500);
    System.out.println("Your new balance is: " + atm.getBalance());
  }
}