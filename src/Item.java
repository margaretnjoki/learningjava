import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Item {
    private String name;
    private LocalDateTime createdAt;


    public Item( String item){
        this.name=item;
        this.createdAt = LocalDateTime.now();
    }


    public String toString() {
        return "item name: " + this.name + " createdAt: " + this.createdAt;
    }
}


class ItemMain{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList <Item> items =new ArrayList<>();

        while(true){
            System.out.println("enter the item: ");
            String input= scanner.nextLine();

            if (input.isEmpty()){
                break;
            }

            items.add(new Item(input));
        }
        for (Item item: items){
            System.out.println(item);
        }
    }
}
