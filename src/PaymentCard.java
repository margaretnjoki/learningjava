public class PaymentCard {
    private double openingBalance;


    public PaymentCard(double openingBalance){
        this.openingBalance=openingBalance;
    }

    public void eatAffordably(){
        if (this.openingBalance > 2.60){
            this.openingBalance= this.openingBalance - 2.60;
        }
    }

    public void eatHeartly(){
        if (this.openingBalance > 4.60){
            this.openingBalance= this.openingBalance - 4.60;
        }
    }

    public void addMoney(double amount){
        if (amount<1){
        double balance= this.openingBalance;
        }
       else if (amount + this.openingBalance > 150){
            this.openingBalance=150;
        }else {
            this.openingBalance=this.openingBalance + amount;
        }
    }


    public String toString() {
        return "the card has a balance of "+ this.openingBalance + " euros";
    }
}
class MainPaymentCard{
    public static void main(String[] args) {
        PaymentCard paulsCard= new PaymentCard(20);
        PaymentCard mattsCard= new PaymentCard(30);


        paulsCard.eatHeartly();
        System.out.println(" paul card: " + paulsCard);

       mattsCard .eatAffordably();
        System.out.println("matt card: " + mattsCard);
        mattsCard.eatHeartly();
        System.out.println("matt card: " + mattsCard);

        paulsCard.addMoney(20);
        System.out.println( "paul card: " + paulsCard);

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        System.out.println("paul card: " + paulsCard);


        mattsCard.addMoney(50);
        System.out.println("matt card: " + mattsCard);

    }
}
