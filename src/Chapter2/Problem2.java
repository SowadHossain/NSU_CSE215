package Chapter2;
import java.lang.Math;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of the sides and height of the Equilateral\n" +
                "triangle: ");
        double side = input.nextDouble();
        double area = (Math.sqrt(3)/4) * Math.pow(side,2);
        double volume = area * side;
        System.out.println("The area is " + area +
                "\nThe volume of the Triangular prism is "+volume);
    }
}
