// Napisz program, który stworzy listę składającą się z liczb naturalnych od 1 do 500,
// ale bez liczb podzielnych przez 6.

public class Zad8 {
    public static void main(String[] args) {

        String nums = "";
        final int NUMS = 500;
        for (int i = 1; i <= NUMS; i++) {
            if (i % 6 != 0) {
                nums = nums + " " + i;
            }
        }
        System.out.println(nums);
    }
}