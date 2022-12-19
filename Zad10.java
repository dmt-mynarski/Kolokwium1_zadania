// Dana jest lista zawierająca liczby naturalne [20,6,3,15,0,10,13,7].
// Napisz program, który wyświetli trzecią co do wielkości liczbę z listy:
// Wyjście: 13

public class Zad10 {

    static int[] sort(int[] nums) {

        int quantityNums = nums.length;
        int min = nums[0];
        int index = 0;

        for (int i = 0; i < quantityNums; i++) {
            for (int j = i; j < quantityNums; j++) {
                if (min > nums[j]) {
                    min = nums[j];
                    index = j;
                }
            }
            nums[index] = nums[i];
            nums[i] = min;
            if (i < quantityNums - 1) {
                min = nums[i+1];
            } else if (i == quantityNums - 1) {
                min = nums[quantityNums - 1];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {20,6,3,15,0,10,13,7};

        sort(nums);
        System.out.println("Trzecia największa liczba tablicy to: " + nums[nums.length - 3]);
//        System.out.println("Posortowana lista: ");
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }
    }
}