// Program prosi użytkownika o podanie dowolnej liczby.
// Napisać funkcję checknumber, która sprawdza czy podane dane są liczbą,
// jeżeli użytkownik nie poda liczby, to ekranie pojawia się napis “To nie jest liczba. Spróbuj jeszcze raz”.
// Program powinien domagać się podania liczby aż do skutku.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad12 {

    static boolean checknumber (String number) {

        Pattern regex = Pattern.compile("^[\\d]+$");
        Matcher matcher = regex.matcher(number);

        if (!matcher.find()) {
            System.out.println("To nie jest liczba. Spróbuj jeszcze raz");
            return false;
        } else {
            System.out.print("Gra i buczy");
            return true;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userNumber;

        do {
            System.out.print("Podaj liczbę: ");
            userNumber = input.nextLine();
        }
        while (!checknumber(userNumber));
        input.close();
    }
}