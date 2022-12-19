// Utwórz plik kolokwium.txt w którym umieścisz numery zadań z tego kolokwium z dopiskiem zad.
// Napisy powinny znajdować się jeden pod drugim.
//
// Wyjście:
//	Zad. 1
//	Zad. 2
//	Zad. 3
//	.
//	.
//	.
//	Zad. 15

import java.io.FileWriter;
import java.io.IOException;

public class Zad13 {
    public static void main(String[] args) {
        try {
            FileWriter myFile = new FileWriter("kolokwium.txt");
            for (int i = 1; i <= 15; i++) {
                myFile.write("Zad. " + i + "\n");
            }
            myFile.close();
            System.out.println("Udany zapis w pliku");
        } catch (IOException e) {
            System.out.println("Błąd zapisu");
            e.printStackTrace();
        }
    }
}