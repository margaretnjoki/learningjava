import java.util.Scanner;

public class MainSimpleDictionaryTextUi {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                SimpleDictionary dictionary = new SimpleDictionary();
                TextUi ui = new TextUi(scanner, dictionary);

                ui.start();
            }
        }

