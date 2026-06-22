import java.util.HashMap;

public class ProgramHashMap {
HashMap <String, String>map;


public ProgramHashMap(){
    this.map=new HashMap<>();
}


    public static void printKeys(HashMap<String,String> hashmap) {
            for (String key : hashmap.keySet()) {
                System.out.println(key);
            }
        }



    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }
    }

    class MainProgramHashMap{
        public static void main(String[] args) {
            HashMap<String, String> hashmap = new HashMap<>();
            hashmap.put("f.e", "for example");
            hashmap.put("etc.", "and so on");
            hashmap.put("i.e", "more precisely");

        ProgramHashMap.printKeys(hashmap);
            System.out.println("---");
          ProgramHashMap.printKeysWhere(hashmap, "i");
            System.out.println("---");
          ProgramHashMap.printValuesOfKeysWhere(hashmap, ".e");
        }
    }

