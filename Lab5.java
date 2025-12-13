import java.util.Scanner;
class Account {
    String customerName;
    int accountNumber;
    String accountType;
    double balance;
    Account(String name, int number, String type) {
        customerName = name;
        accountNumber = number;
        accountType = type;
        balance = 0.0;
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful");
    }
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful");
        } 
        else
            System.out.println("Insufficient balance");
    }
    void displayAccount() {
        System.out.println("Customer name: " + customerName);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Type of Account: " + accountType);
        System.out.println("Account Balance: " + balance);
    }
}
class Savacct extends Account {
    Savacct(String name, int number) {
        super(name, number, "saving");
    }
    void computeInterest() {
        double rate = 0.05;
        double interest = balance * rate;
        balance += interest;
        System.out.println("Interest " + interest + " added");
        System.out.println("Updated balance: " + balance);
        System.out.println();
    }
    /*  void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful");
        } 
        else
            System.out.println("Insufficient balance");
    } */
}
class Curracct extends Account{
    double minBalance = 1000;
    double serviceCharge = 100;
    Curracct(String name,int number){
        super(name,number,"current");
    }
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            checkMinBalance();
        } 
        else
            System.out.println("Insufficient balance");
    }
    void checkMinBalance() {
        if (balance < minBalance) {
            System.out.println("Balance below minimum. Penalty applied: " + serviceCharge);
            balance -= serviceCharge;
            if (balance < 0) balance = 0;
            System.out.println("Updated balance after penalty: " + balance);
        } 
        else {
            System.out.println("Minimum balance maintained.");
        }
    }
}
public class Lab5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter customer name: ");
    String name1 = sc.nextLine();
    System.out.print("Enter account number: ");
    int acc1 = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter customer name: ");
    String name2 = sc.nextLine();
    System.out.print("Enter account number: ");
    int acc2 = sc.nextInt();
    sc.nextLine();

    Savacct s1 = new Savacct(name1,acc1);
    Curracct c1 = new Curracct(name2,acc2);

    int choice;

    do {
        System.out.println("\n-----MENU------");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Compute Interest for Savings Account");
        System.out.println("4. Display Account Details");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter the type of account (saving/current): ");
                String t1 = sc.nextLine().toLowerCase();
                System.out.print("Enter the deposit amount: ");
                double d = sc.nextDouble();
                if (t1.equals("saving")) {
                    s1.deposit(d);
                    s1.displayAccount();
                }
                else {
                    c1.deposit(d);
                    c1.displayAccount();
                }
                break;

            case 2:
                System.out.print("Enter the type of account (saving/current): ");
                String t2 = sc.nextLine().toLowerCase();
                System.out.print("Enter the withdrawal amount: ");
                double w = sc.nextDouble();
                if (t2.equals("saving")) {
                    s1.withdraw(w);
                    s1.displayAccount();
                }
                else {
                    c1.withdraw(w);
                    c1.displayAccount();
                }
                break;

            case 3:
                System.out.print("Enter the type of account (saving/current): ");
                String t3 = sc.nextLine().toLowerCase();
                if (t3.equals("saving")) s1.computeInterest();
                else System.out.println("Current account has no interest.");
                break;

            case 4:
                System.out.print("Enter the type of account (saving/current): ");
                String t4 = sc.nextLine().toLowerCase();
                if (t4.equals("saving")) s1.displayAccount();
                else c1.displayAccount();
                break;

            case 5:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice");
        }

    } while (choice != 5);

    sc.close();
}

}
