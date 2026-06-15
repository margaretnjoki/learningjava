public class BookClass {

private String author;
private String name;
private int pages;



    public BookClass(String author, String name, int pages){
        this.author=author;
        this.name= name;
        this.pages= pages;
    }

    public String getAuthor(){
        return this.author;
    }


    public String getName(){
        return this.name;
    }

    public int getPages(){
        return this.pages;
    }

    public String toString() {
      return  this.author + "," + this.name + "," + this.pages;
    }
}
class BookClassMain{
    public static void main(String[] args) {
        BookClass book= new BookClass("maggy", "the goons", 230);

        System.out.println(book);
    }
}
