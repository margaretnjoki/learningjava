import java.util.ArrayList;
import java.util.Scanner;

public class Book {
  private String  title;
 private int numberOfPages;
   private int publicationYear;



   public Book(String title, int numberOfPages, int publicationYear){
       this.title= title;
       this.numberOfPages= numberOfPages;
       this.publicationYear= publicationYear;
   }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return "title: " + title   + " pages: " + numberOfPages + " publicationYear: " + publicationYear;
    }
}

class BookMain{
    public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();

    while (true){
        System.out.println("Enter title: ");
        String title= scanner.nextLine();
        if (title.isEmpty()){
            break;
        }
        System.out.println("pages: ");
        int numberOfPages= Integer.valueOf(scanner.nextLine());
        System.out.println("publication year: ");
        int pub=Integer.valueOf(scanner.nextLine()) ;

        books.add(new Book(title, numberOfPages, pub));
    }

        System.out.println("what information will be printed? ");
            String printed= scanner.nextLine();

        if (printed.equals("everything")){
            for (Book book:books){
                System.out.println(book);
            }
        }
        if (printed.equals("name")){
            for (Book book: books){
                System.out.println(book.getTitle());
            }
        }
    }
}
