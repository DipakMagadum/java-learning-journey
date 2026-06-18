interface Payment {

    void pay();
}

class UpiPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment completed using UPI");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        UpiPayment payment = new UpiPayment();

        payment.pay();
    }
}