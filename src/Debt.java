public class Debt {
    private double balance;
    private double interestRate;


    public Debt(double balance, double interestRate){
        this.balance= balance;
        this.interestRate= interestRate;
    }

    public void printBalance(){
        System.out.println("balance: " + this.balance);
    }

    public double waitOneYear(){
        this.balance= this.balance * this.interestRate;
        return this.balance;
    }
}

class MainProgram{
    public static void main(String[] args) {
        Debt mortgage= new Debt(120000.0,  1.01);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        while (years < 20) {
            mortgage.waitOneYear();
            years = years + 1;
        }

        mortgage.printBalance();
    }
}
