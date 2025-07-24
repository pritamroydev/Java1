abstract class BankAccount{
    String accountNumber;
    double balance;

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    public void display(){
        System.out.println("Current Balance: "+this.balance);
    }

    public double calculateInterest(double rate, int time){
        return (balance*rate*time)/100;

    }

}

class SavingsAccount extends BankAccount{

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(balance>=amount){
            balance -= amount;
        }
    }
    @Override
    public double calculateInterest(double rate, int time){
        double interest = super.calculateInterest(rate, time);
        return interest + 100;
    }

    public void displayBalance(){
        super.display();
    }
    
}

class CurrentAccount extends BankAccount{
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(balance>=-5000){
            balance -= amount;
        }
    }

    public void displayBalance(){
        super.display();
    }
}



public class Main{
    public static void main(String args[]){
        SavingsAccount ba1 = new SavingsAccount();
        ba1.deposit(2000);
        ba1.displayBalance();
        ba1.withdraw(500);
        ba1.displayBalance();
        double interest = ba1.calculateInterest(2, 5);
        System.out.println("Interest on current balance "+ba1.balance+" is: "+interest);

        CurrentAccount ba2 = new CurrentAccount();
        ba2.deposit(5000);
        ba2.displayBalance();
        ba2.withdraw(7000);
        ba2.displayBalance();


    }

}
