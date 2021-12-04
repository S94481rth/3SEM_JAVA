import java.util.Scanner;
class Bank{
    String name;
    String phone_number;
    double balance;
    Bank(String name , String phone_number, int balance){
        this.name = name;
        this.phone_number = phone_number;
        this.balance = balance;
    }
    void accept(){
        Scanner in = new Scanner(System.in);
        System.out.println("The amount being deposited :: ");
        double deposit = in.nextInt();
        balance = balance + deposit;
    }
    void display(){
        System.out.println("Name of account holder :: " + name);
        System.out.println("Number of account holder :: " + phone_number);
        System.out.println("Present balance of account holder :: " + balance);
    }
}
class Sav_acc extends Bank{
    double interest;
    Sav_acc(String name , String phone_number, int balance,double interest){
        super(name,phone_number,balance);
        this.interest = interest;
    }
    void compute(){
        balance = balance*(1+interest/100);
    }
}
class Curr_acc extends Bank{
    double min_balance;
    Curr_acc(String name , String phone_number, int balance,double min_balance){
        super(name,phone_number,balance);
        this.min_balance = min_balance;
    }
    void min_balance_check(){
        if (balance < min_balance){
            System.out.println("Balance less than min balance...\n 300/- will be deducted ... \n deposit amount again::");
            balance = balance - 300;
            accept();            
        }
        
    }
}
class Main{
    public static void main(String args[]){
        Sav_acc account1 = new Sav_acc("Kevin","258745",0,5);
        Curr_acc account2 = new Curr_acc("Jim","365487",0,10000);
        account1.accept();
        account1.compute();
        account1.display();
        account2.accept();
        account2.min_balance_check();
        account2.display();
    }
}
