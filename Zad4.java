// Dana jest lista [-3,0,56,12,-23,45,10,8]
// Napisz program, który wyświetli na ekranie największą liczbę z podanej listy.

public class Zad4 {
    public static void main(String[] args) {
        int[] array = {-3,0,56,12,-23,45,10,8};

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Największa liczba tablicy to: " + max);
    }
}