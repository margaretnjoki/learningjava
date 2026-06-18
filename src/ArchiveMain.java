import java.util.ArrayList;
import java.util.Scanner;

public class ArchiveMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> items = new ArrayList<>();

        while (true) {
            System.out.print("Identifier: ");
            String identifier = scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            if (identifier.isEmpty() || name.isEmpty()) {
                break;
            }

            Archive newItem = new Archive(identifier, name);

            boolean exists = false;

            for (Archive item : items) {
                if (item.getIdentifier().equals(identifier)) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                items.add(newItem);
            }
        }

        for (Archive item : items) {
            System.out.println(item);
        }
    }
}