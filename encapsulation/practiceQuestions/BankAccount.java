package encapsulation.practiceQuestions;
// Create a class BankAccount with instance variables balance and accountNumber.
//  Implement encapsulation such that the balance can only be changed through the use of deposit
//  and withdraw methods, and the account number cannot be changed once it is set.
public class BankAccount {
    private long balance;
    private final long accountNumber;
    
    public BankAccount(long balance, long accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    // methods for balance
    public void deposit(float amount){
        this.balance += amount;
        
    }

    public void withdraw(float amount){
        this.balance -= amount;
    }

    public long getBalance() { return this.balance; }

    // method for account number
    public long getAccountNumber(){ return this.accountNumber; }
}
