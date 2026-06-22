import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }


    public void add(String unit, String item){
        if (!this.storage.containsKey(unit)){
            this.storage.put(unit,new ArrayList<>());
        }
        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        if (this.storage.containsKey(storageUnit)){
            return this.storage.get(storageUnit);
        }
        return new ArrayList<>();
    }

    public void remove(String storageUnit, String item) {
        if (!storage.containsKey(storageUnit)) {
            return;
        }

        ArrayList<String> items = storage.get(storageUnit);

        items.remove(item); // removes only ONE occurrence

        if (items.isEmpty()) {
            storage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();

        for (String unit : storage.keySet()) {
            if (!storage.get(unit).isEmpty()) {
                units.add(unit);
            }
        }

        return units;
    }
}

class MainStorageFacility{
    public static void main(String[] args) {
        StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        facility.remove("f156", "rollerblades");

        System.out.println(facility.contents("f156"));

        facility.remove("f156", "rollerblades");

        System.out.println(facility.storageUnits());

    }
}