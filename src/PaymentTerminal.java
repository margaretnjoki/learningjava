public class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal() {
        this.money=1000;
        this.affordableMeals=0;
        this.heartyMeals=0;
    }

    public double eatAffordably(double payment) {

        if (payment >= 2.50 ) {
            double change= payment- 2.50;
            this.money=this.money + 2.50;
            affordableMeals =affordableMeals + 1;
            return change;
        }else {
            return payment;
        }

    }


    public double eatHeartily(double payment) {

            if (payment >= 4.30){
               double change= payment - 4.30;
               this.money=this.money + 4.30;
               heartyMeals=heartyMeals + 1;
               return change;
            }else {
                return payment;
            }
    }


    public boolean eatAffordably(PaymentCardClass card) {
        if ( card.balance() >= 2.50){
            card.takeMoney(2.50);
            return true;
        } else {
            return false;
        }

    }

    public boolean eatHeartily(PaymentCardClass card) {
        if (card.balance() >= 4.30){
            card.takeMoney(4.30);
            return true;
        }else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCardClass card, double sum) {
        this.money=this.money + sum;
        card.addMoney(sum);
    }



    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }

}

