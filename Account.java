// Practicing polymorphism

class Account {
    
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {}

    public void deposit(double amount) {}

    public void printBalance() {}
    
}

class Savings extends Account {

    private double interestRate = 0.8;

    public Savings(double balance) {
        super(balance);
    }
    
    public void withdraw(double amount) {
        this.balance -= (1 + this.interestRate) * amount;
    }

    public void deposit(double amount) {
        this.balance += (1 + this.interestRate) * amount;
    }

    public void printBalance() {
        System.out.println("Balance in your saving account: " + this.balance);
    }
    
}

class Current extends Account {

    public Current(double balance) {
        super(balance);
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void printBalance() {
        System.out.println("Balance in your current account: " + this.balance);
    }
    
}

class AccountDemo {
  
    public static void main(String args[]) {
        // creating savings account object
        Account SAccount = new Savings(50000);
            
        SAccount.deposit(1000);
        SAccount.printBalance();

        SAccount.withdraw(3000);
        SAccount.printBalance();

        System.out.println();

        // creating current account object
        Account CAccount = new Current(50000);
        CAccount.deposit(1000);
        CAccount.printBalance();

        CAccount.withdraw(3000);
        CAccount.printBalance();
    }
    
  }
