//  Używając algorytmu przeszukiwania binarnego rozwiązać równanie:
//  x2 = 2
//  z dokładnością do 0,0001.

public class Zad7 {
    public static void main(String[] args) {

        double min = 1.0d;
        double max = 2.0d;
        double diff = max - min;
        double precision = 0.0001d;
        double middle = 0.0d;
        double target = Math.sqrt(max);

        while (diff >= precision) {
            middle = (min + max) / 2;
            if (middle < target) {
                min = middle;
            } else {
                max = middle;
            }
            diff = max - min;
        }
        System.out.println("X wynosi: " + middle);
        System.out.println("X wynosi: " + target + " (pierwiastek)");
    }
}