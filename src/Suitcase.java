import java.util.ArrayList;

public class Suitcase {
    private ArrayList<ItemClass> items;
    private int maxWeight;


    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(ItemClass item) {

            if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
                this.items.add(item);
            }
        }



    public int totalWeight() {
        int weight = 0;

        for (ItemClass item : this.items) {
            weight += item.getWeight();
        }

        return weight;
    }

    public void printItems() {
        for (ItemClass item : this.items) {
            System.out.println(item);
        }
    }

    public ItemClass heaviestItem(){
        if (this.items.isEmpty()){
            return null;
        }
        ItemClass heaviest= this.items.get(0);
        for (ItemClass item : this.items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }

        }

            return heaviest;
    }




    public String toString() {
        int count = this.items.size();

        if (count == 0) {
            return "no items (" + totalWeight() + " kg)";
        } else if (count == 1) {
            return "1 item (" + totalWeight() + " kg)";

        }

        return count + " items (" + totalWeight() + " kg)";
    }
}