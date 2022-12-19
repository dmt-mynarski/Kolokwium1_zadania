// Program prosi użytkownika o podanie dowolnej liczby naturalnej.
// Jeżeli użytkownik poda złą liczbę, to wyświetla się komunikat “Haha, nie zgadłeś”
// oraz kolejny raz wyświetla się prośba o podanie dowolnej liczby naturalnej.
// Program kończy się w momencie gdy użytkownik poda liczbę: 2021,
// wówczas wyświetla się komunikat “Zgadłeś moją liczbę, dziękuję za zabawę”.

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Odgadnij liczbę: ");
        int number = input.nextInt();

        while (number != 2021) {
            System.out.println("Haha, nie zgadłeś");
            System.out.print("Spróbuj ponownie: ");
            number = input.nextInt();
        }

        System.out.println("Zgadłeś moją liczbę, dziękuję za zabawę");
        input.close();
    }
}