class BankAccount {
    private int balance = 1000;

    void withdrawWithoutSync(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName()
                    + " is withdrawing " + amount);

            try {
                Thread.sleep(100);
            }
            catch (Exception e) {
            }

            balance = balance - amount;

            System.out.println("Balance = " + balance);
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName()
                    + " is withdrawing " + amount);

            balance = balance - amount;

            System.out.println("Balance = " + balance);
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    int getBalance() {
        return balance;
    }
}

class BankCustomer extends Thread {

    BankAccount account;
    boolean sync;

    BankCustomer(BankAccount account, String name, boolean sync) {
        super(name);
        this.account = account;
        this.sync = sync;
    }

    public void run() {
        if (sync)
            account.withdraw(700);
        else
            account.withdrawWithoutSync(700);
    }
}

public class BankDemo {

    public static void main(String[] args) {

        System.out.println("Without Synchronization");

        BankAccount account1 = new BankAccount();

        BankCustomer c1 =
            new BankCustomer(account1, "Customer 1", false);

        BankCustomer c2 =
            new BankCustomer(account1, "Customer 2", false);

        c1.start();
        c2.start();

        try {
            c1.join();
            c2.join();
        }
        catch (Exception e) {
        }

        System.out.println("Final Balance = "
                + account1.getBalance());

        System.out.println("\nWith Synchronization");

        BankAccount account2 = new BankAccount();

        BankCustomer c3 =
            new BankCustomer(account2, "Customer 3", true);

        BankCustomer c4 =
            new BankCustomer(account2, "Customer 4", true);

        c3.start();
        c4.start();

        try {
            c3.join();
            c4.join();
        }
        catch (Exception e) {
        }

        System.out.println("Final Balance = "
                + account2.getBalance());
    }
}