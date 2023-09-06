public class SumArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sumFor = 0, sumWhile = 0, sumDoWhile = 0;

        //for
        for (int i = 0; i < arr.length; i++) {
            sumFor += arr[i];
        }

        //while
        int i = 0;
        while (i < arr.length) {
            sumWhile += arr[i];
            i++;
        }

        //do while
        i = 0;
        do {
            sumDoWhile += arr[i];
            i++;
        } while (i < arr.length);

        System.out.println("Сумма элементов массива (for): " + sumFor);
        System.out.println("Сумма элементов массива (while): " + sumWhile);
        System.out.println("Сумма элементов массива (do while): " + sumDoWhile);
    }
}