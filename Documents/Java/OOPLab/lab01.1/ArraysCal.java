import java.util.Scanner;
import java.util.Arrays;

public class ArraysCal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] Arr = new int[n];
        System.out.println("Enter each element of the array: ");
        for (int i = 1; i <= n; i++) {
            System.out.println("Element " + i + ": ");
            int x = scanner.nextInt();
            Arr[i - 1] = x;
        }
        Arrays.sort(Arr);
        int S;
        S = 0;
        for (int i = 0; i < Arr.length; i++) {
            S += Arr[i];
        }
        double d = (double) S / n;
        System.out.println("Sorted array: " + Arrays.toString(Arr));
        System.out.println("Sum: " + S);
        System.out.println("Average: " + d);
        scanner.close();
    }
}
