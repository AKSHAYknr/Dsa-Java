package StratergyDesignPattern;

public class Cart {
    
    PaymentStratergy stratergy;

    Cart(PaymentStratergy stratergy){
        this.stratergy = stratergy;
    }

    void pay(){
        stratergy.pay();
    }
}
