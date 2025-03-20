import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1, count = 1; count <= n; i += 2, count++) {
            sum += i * i; 
        }
        System.out.println("The sum of the series is: " + sum);
        scanner.close();
    }
}
