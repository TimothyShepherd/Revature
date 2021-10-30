package Day6;

abstract class Bank{

    abstract double getBalance();
}

class BankA extends Bank{

    private double balance;

    void deposit(double dollars){
        balance += dollars;
    }

    @Override
    double getBalance(){
        return balance;
    }
}

class BankB extends Bank{

    private double balance;

    void deposit(double dollars){
        balance += dollars;
    }

    @Override
    double getBalance(){
        return balance;
    }
}

class BankC extends Bank{

    private double balance;

    void deposit(double dollars){
        balance += dollars;
    }

    @Override
    double getBalance(){
        return balance;
    }
}

public class RevatureBankDemo{
    public static void main(String[] args){

        BankA TimsBank = new BankA();
        BankB MarksBank = new BankB();
        BankC SarahsBank = new BankC();

        TimsBank.deposit(100);

        MarksBank.deposit(150);

        SarahsBank.deposit(200);

        System.out.println("Tim's Bank: $" + TimsBank.getBalance());
        System.out.println("Mark's Bank: $" + MarksBank.getBalance());
        System.out.println("Sarah's Bank: $" + SarahsBank.getBalance());
    }
}
