import java.util.Scanner;

public class Film {
    private String name;
    private int filmageRating;



    public Film(String filmName, int filmAgeRating){
        this.name= filmName;
        this.filmageRating= filmAgeRating;
    }
    public String name(){
            return this.name;
    }

    public int filmageRating(){
        return this.filmageRating;
    }
}
class ProgramMainFilm{
    public static void main(String[] args) {
        Film film= new Film("The Duck", 7);
        Scanner scanner= new Scanner(System.in);
        System.out.println("how old are you? ");
        int age =Integer. parseInt(scanner.nextLine()) ;

        if (age >= film.filmageRating() ){
            System.out.println("you may watch the film : "  +  film.name());
        }
        else {
            System.out.println("you may not watch the film: " + film.name());
        }
    }
}
