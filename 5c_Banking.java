class Account {
    int accountNo;
    double balance;

    Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    SavingsAccount(int accountNo, double balance) {
        super(accountNo, balance);
    }
}

class CurrentAccount extends Account {
    CurrentAccount(int accountNo, double balance) {
        super(accountNo, balance);
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void displayCustomer() {
        System.out.println("Customer: " + name);
    }
}

class BankEmployee {
    String name;

    BankEmployee(String name) {
        this.name = name;
    }

    void displayEmployee() {
        System.out.println("Bank Employee: " + name);
    }
}

class Banking {
    public static void main(String[] args) {
        Customer customer = new Customer("Charitha");
        BankEmployee employee = new BankEmployee("Manager");

        SavingsAccount account = new SavingsAccount(101, 5000);

        customer.displayCustomer();
        employee.displayEmployee();

        account.deposit(2000);
        account.withdraw(1000);
        account.displayBalance();
    }
}