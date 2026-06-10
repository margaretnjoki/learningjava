public class Door {



    public void knock(){
        System.out.println("who's there? ");
    }
}
class Knock{
    public static void main(String[] args) {
        Door frontDoor=new Door();
        frontDoor.knock();
        frontDoor.knock();
        frontDoor.knock();

    }
}
