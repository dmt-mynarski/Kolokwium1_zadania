// Dana jest lista zawierająca liczby naturalne [20,12,2,5,11,3].
// Napisz program, który wyświetli średnią arytmetyczną liczb z listy.

public class Zad11 {
    public static void main(String[] args) {

        int[] nums = {20,12,2,5,11,3};
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        System.out.println("Średnia arytmetyczna liczb z tablicy wynosi: " + ((float)total / nums.length));
    }
}