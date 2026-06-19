public class ItemSuitcaseHoldMain {
        public static void main(String[] args) {
            /*
            ItemClass book = new ItemClass("The lord of the rings", 2);
           // ItemClass phone = new ItemClass("Nokia 3210", 1);

            System.out.println("The book's name: " + book.getName());
            System.out.println("The book's weight: " + book.getWeight());

            System.out.println("Book: " + book);
            System.out.println("Phone: " + phone);*/

            System.out.println();

           /* ItemClass book = new ItemClass("Lord of the rings", 2);
            ItemClass phone = new ItemClass("Nokia 3210", 1);
            ItemClass brick = new ItemClass("brick", 4);

            Suitcase suitcase = new Suitcase(5);
            System.out.println(suitcase);

            suitcase.addItem(book);
            System.out.println(suitcase);

            suitcase.addItem(phone);
            System.out.println(suitcase);

            suitcase.addItem(brick);
            System.out.println(suitcase);

            System.out.println();


            */


                    ItemClass book = new ItemClass("Lord of the rings", 2);
                    ItemClass phone = new ItemClass("Nokia 3210", 1);
                    ItemClass brick = new ItemClass("brick", 4);

                    Suitcase adasCase = new Suitcase(10);
                    adasCase.addItem(book);
                    adasCase.addItem(phone);

                    Suitcase pekkasCase = new Suitcase(10);
                    pekkasCase.addItem(brick);

                    Hold hold = new Hold(1000);
                    hold.addSuitcase(adasCase);
                    hold.addSuitcase(pekkasCase);

                    System.out.println("The suitcases in the hold contain the following items:");
                    hold.printItems();
                }
        }



