import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = Scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");
        Scanner.close();
    }
}