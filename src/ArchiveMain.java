
import java.util.ArrayList;
import java.util.Scanner;

public class ArchiveMain {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Archive> archives= new ArrayList<>();

            while (true) {
                System.out.print("Identifier: ");
                String identifier = scanner.nextLine();

                System.out.print("Name: ");
                String name = scanner.nextLine();

                if (identifier.isEmpty() || name.isEmpty()) {
                    break;
                }

                archives.add(new Archive(identifier, name));
            }

            for (Archive archive : archives) {
                System.out.println(archive);
            }
        }
    }

