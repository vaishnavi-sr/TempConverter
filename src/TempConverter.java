import java.sql.SQLOutput;
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Fahrenheit value :  ");
        fahrenheit = input.nextDouble();
        input.close();

        celsius = (fahrenheit - 32) *5/9;
        System.out.println("The temperature in celsius is: " + celsius + "°C");
    }
}
