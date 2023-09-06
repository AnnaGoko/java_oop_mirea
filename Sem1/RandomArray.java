import java.util.Arrays;
public class RandomArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Сортированный массив: " + Arrays.toString(arr));
    }
}