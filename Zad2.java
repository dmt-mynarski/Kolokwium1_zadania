// Program prosi użytkownika o podanie łańcucha składającego się z 10 znaków.
// Jeżeli użytkownik poda właściwą długość łańcucha,
// to na ekranie wyświetli się komunikat “Poprawna długość łańcucha”
// w przeciwnym razie użytkownik zobaczy komunikat “Łańcuch ma niewłaściwą długość”.
// Sprawdzanie długości ciągu ma się odbyć tylko raz.

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner userWord = new Scanner(System.in);
        System.out.print("Podaj slowo:");
        String word = userWord.nextLine();

        if (word.length() == 10) {
            System.out.println("Poprawna długość łańcucha");
        } else {
            System.out.println("Łańcuch ma niewłaściwą długość");
        }
        userWord.close();
    }
}