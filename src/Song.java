public class Song {
    private String name;
    private int length;


    public Song(String name, int length){
        this.name=name;
        this.length=length;
    }
    public  String name(){
        return this.name;
    }

    public int length(){
        return this.length;
    }
}

 class ProgramMain{
     public static void main(String[] args) {
         Song symphony= new Song( "Symphony" , 120000);
         System.out.println("The song " + symphony.name() + " has " + symphony.length() + " seconds" );
     }

}