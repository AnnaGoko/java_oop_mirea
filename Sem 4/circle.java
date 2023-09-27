import java.util.Scanner;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle[] circles = new Circle[3];

        for (int i = 0; i < circles.length; i++) {
            System.out.print("Enter the radius of circle " + (i + 1) + ": ");
            double radius = scanner.nextDouble();
            circles[i] = new Circle(radius);
        }

        Circle smallestCircle = circles[0];
        Circle largestCircle = circles[0];

        for (int i = 1; i < circles.length; i++) {
            if (circles[i].getRadius() < smallestCircle.getRadius()) {
                smallestCircle = circles[i];
            }

            if (circles[i].getRadius() > largestCircle.getRadius()) {
                largestCircle = circles[i];
            }
        }

        System.out.println("Smallest circle radius: " + smallestCircle.getRadius());
        System.out.println("Largest circle radius: " + largestCircle.getRadius());

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        System.out.println("Unsorted numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        bubbleSort(numbers);

        System.out.println("\nSorted numbers in ascending order: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nSorted numbers in descending order: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}