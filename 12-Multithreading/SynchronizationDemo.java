class BankAccount {

    private int balance = 10000;

    public synchronized void withdraw(String customer, int amount) {

        System.out.println(customer + " is trying to withdraw ₹" + amount);

        if (balance >= amount) {

            System.out.println(customer + " withdrawal approved.");

            balance -= amount;

            System.out.println(
                    "Remaining Balance : ₹" + balance
            );

        } else {

            System.out.println(
                    customer + " withdrawal failed. Insufficient balance."
            );

        }

        System.out.println();

    }

}

public class SynchronizationDemo extends Thread {

    private BankAccount account;
    private String customer;
    private int amount;

    public SynchronizationDemo(
            BankAccount account,
            String customer,
            int amount
    ) {

        this.account = account;
        this.customer = customer;
        this.amount = amount;

    }

    @Override
    public void run() {

        account.withdraw(customer, amount);

    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        SynchronizationDemo customerOne =
                new SynchronizationDemo(
                        account,
                        "Rahul",
                        4000
                );

        SynchronizationDemo customerTwo =
                new SynchronizationDemo(
                        account,
                        "Priya",
                        7000
                );

        customerOne.start();
        customerTwo.start();

    }

}