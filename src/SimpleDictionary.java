import java.util.ArrayList;

public class SimpleDictionary {

    private ArrayList<String> words;
    private ArrayList<String> translations;

    public SimpleDictionary() {
        this.words = new ArrayList<>();
        this.translations = new ArrayList<>();
    }

    public void add(String word, String translation) {
        words.add(word);
        translations.add(translation);
    }

    public String translate(String word) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals(word)) {
                return translations.get(i);
            }
        }
        return null;
    }
}