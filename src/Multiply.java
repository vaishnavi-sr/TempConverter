import java.util.Scanner;

public class Multiply {

    public static void main(String[] args) {
        int a;
        int b;
        int multiple;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of 'a': ");
        a =  input.nextInt();

        System.out.println("Enter the value of 'b': ");
        b = input.nextInt();
        input.close();

        System.out.println("The multiple of given a and b is " + a * b);

    }
}
