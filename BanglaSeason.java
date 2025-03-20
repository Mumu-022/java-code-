import java.util.Scanner;

public class BanglaSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();
        String season = "";
        
        if (month == 1 || month == 2) {
            season = "Shishir (Winter)";
        } else if (month == 3 || month == 4) {
            season = "Grishmo (Summer)";
        } else if (month == 5 || month == 6) {
            season = "Borsha (Rainy)";
        } else if (month == 7 || month == 8) {
            season = "Sharat (Autumn)";
        } else if (month == 9 || month == 10) {
            season = "Hemanta (Pre-winter)";
        } else if (month == 11 || month == 12) {
            season = "Basant (Spring)";
        } else {
            season = "Invalid month. Please enter a number between 1 and 12.";
        }
        System.out.println("The Bangla season for month " + month + " is: " + season);
        scanner.close();
    }
}
