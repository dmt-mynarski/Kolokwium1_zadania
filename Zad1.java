// Słabnią nazywamy sumę kolejnych liczb naturalnych nieprzekraczających n.
// n?=1+2+3+...n
// Napisz program, który pobiera od użytkownika liczbę n,
// a następnie wypisuje na ekranie ile wynosi słabna dla podanej liczby, np: 5?=15.

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner userNumber = new Scanner(System.in);
        System.out.println("Podaj liczbe slabni: ");
        int n = userNumber.nextInt();

        int slabnia = 0;

        for (int i = 1; i <= n; i++) {
            slabnia = slabnia + i;
        }

        System.out.println("Slabnia " + n + " wynosi: " + slabnia);
        userNumber.close();
    }
}