package StratergyDesignPattern;

class PayPal implements PaymentStratergy {

    @Override
    public void pay() {
        System.out.println("Paypal it");
    }  
}
