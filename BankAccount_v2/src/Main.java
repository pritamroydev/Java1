abstract class BankAccount{
    double balance;
    public double calculateInterest(double rate, int time){
        return balance*rate*time;
    }
    final String accountType(){                         // "final" keyword: cannot be overwritten
        return "Generic Bank Account";      
    }
    void printDetails(){
        System.out.println("BankAccount: Balance: " + balance +"; Account Type: " + accountType());
    }
}

class SavingsAccount extends BankAccount{
    @Override
    public double calculateInterest(double rate, int time){
        System.out.println("Savings Account Interest Calculated");
        printDetails();
        System.out.println("This is a Savings Account");
        
        return super.calculateInterest(rate, time);
    }
}

class CheckingAccount extends BankAccount{
    @Override
    public double calculateInterest(double rate, int time){
        System.out.println("Checking Account Interest Calculated");
        printDetails();
        System.out.println("This is a Checking Account");
        return 0;
    }
}

public class Main{
    public static void main(String args[]){
        BankAccount a1 = new SavingsAccount();          // Upcasting
        a1.balance=5000;
        double ci1 = a1.calculateInterest(0.04, 1);
        System.out.println("Interest: "+ ci1);        // Dymnamic Method Dispatch
        System.out.println();
        BankAccount a2 = new CheckingAccount();
        a2.balance = 2000;
        double ci2 = a2.calculateInterest(0.04, 1);
        System.out.println("Interest: "+ ci2);
        
        
    }
}

