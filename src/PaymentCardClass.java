public class PaymentCardClass {
    private double balance;

    public PaymentCardClass(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance = this.balance + increase;
    }

    public boolean takeMoney(double amount) {

        if ( this.balance >= amount){
            this.balance= this.balance- amount;
            return true;
            }
        else{
            return false;

        }

    }
}

 class MainProgramClass {
    public static void main(String[] args) {
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);

        PaymentCardClass annesCard = new PaymentCardClass(2);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);
    }
}
        /*PaymentCardClass petesCard = new PaymentCardClass(10);

        System.out.println("money " + petesCard.balance());
        boolean wasSuccessful = petesCard.takeMoney(8);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());

        wasSuccessful = petesCard.takeMoney(4);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());
    }*/

/*
                PaymentTerminal unicafeExactum = new PaymentTerminal();

                double change = unicafeExactum.eatAffordably(10);
                System.out.println("remaining change " + change);

                change = unicafeExactum.eatAffordably(5);
                System.out.println("remaining change " + change);

                change = unicafeExactum.eatHeartily(4.3);
                System.out.println("remaining change " + change);

                System.out.println(unicafeExactum);*/





