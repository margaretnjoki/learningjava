public class Exercise59 {
    public static void main(String[] args) {
        Account matthewsAccount = new Account("Matthews account ", 1000.0);
        Account myAccount = new Account("My account ", 0.0);

        matthewsAccount.withdraw(100.0);
        myAccount.deposit(100.0);

                System.out.println(matthewsAccount);
                System.out.println(myAccount.toString());
            }
        }
    class Account{
                private  String name;
                private double balance;


        public Account(String name, double balance){
            this.name=name;
            this.balance=balance;
        }

            public void deposit(double amount) {
                balance = balance + amount;
            }

            public void withdraw(double amount) {
                balance = balance- amount;
            }

        public String toString() {
            return name + balance;
        }
    }



