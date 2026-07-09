class bankAccountInfo {
    String firstName;
    String lastName;
    int accountID;
    String accountType;
    int pin;
    double balance;
    
    public bankAccountInfo(String firstName, String lastName, int accountID, String accountType, int pin, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.accountType = accountType;
        this.pin = pin;
        this.balance = balance;
    }
    
    public double deposit(int amount) {
        this.balance = this.balance + amount;
        return balance;
    }
    
    public double withdraw(int amount) {
        this.balance = this.balance - amount;
        return balance;
    }
    
    public void displayInfo() {
        System.out.println("The balance is: " + this.balance);
    }
    
}

public class bankAccount{
    public static void main(String[] args) {
        bankAccountInfo an = new bankAccountInfo("An", "Vu", 1243, "Private", 1234, 1000);
        
        an.deposit(56);
        an.withdraw(72);
        an.displayInfo();
    }
}