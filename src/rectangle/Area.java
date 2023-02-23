package rectangle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of the rectangle- ");
        int length = input.nextInt();
        System.out.println("Enter breadth of the rectangle- ");
        int breadth = input.nextInt();
        input.close();
        System.out.println("The area of the rectangle for given dimension is " + (length*breadth) + " sq/units");

    }
}
