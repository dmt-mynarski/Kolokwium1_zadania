// Dana jest lista liczb naturalnych [1,2,3,4,5,6,7,8,9,10,11,12].
// Program prosi użytkownika o podanie dowolnej liczby,
// jeżeli podana przez użytkownika liczba znajduje się na liście,
// to wyświetlamy komunikat “Liczba znajduje się na liście.”
// w przeciwnym wypadku wyświetla się komunikat “Liczba jest na liście”.

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12};

        Scanner userInt = new Scanner(System.in);
        System.out.print("Podaj szukaną liczbę: ");
        int enterNum = userInt.nextInt();
        userInt.close();

        int start = 0;
        int end = nums.length - 1;
        int middle = nums.length/2;

        while (enterNum != nums[middle]) {
            if (enterNum < nums[middle]) {
                end = middle - 1;
                middle = (start + end) / 2;
            } else {
                start = middle + 1;
                middle = (start + end) / 2;
            }
            if (start > end) {
                System.out.println("Liczba nie jest na liście");
                return;
            }
        }
        System.out.println("Liczba znajduje się na liście.");
    }
}