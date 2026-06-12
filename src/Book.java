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

}

class BookMain{
    public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();

    }

}
