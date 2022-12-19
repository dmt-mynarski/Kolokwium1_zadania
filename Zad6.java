// Napisz funkcję wzor(x), posiadającą jeden argument.
// Funkcja ma obliczać wartość wyrażenia: 3x2 -6x-1

import java.util.Scanner;

public class Zad6 {

    static int wzor (int x) {
        int power = 3 * (x * x);
        int multi = 6 * x;
        return power - multi - 1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj wartość x: ");
        int x = input.nextInt();

        System.out.println("Dla x = " + x + " wyrażenie wynosi: " + wzor(x));
        input.close();
    }
}