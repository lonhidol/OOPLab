import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the height of the triangle (n): ");
        int n = scanner.nextInt();
        int stars = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= stars; k++) {
                System.out.print("*");
            }
            System.out.println();
            stars += 2;
        }
        scanner.close();
    }
}
