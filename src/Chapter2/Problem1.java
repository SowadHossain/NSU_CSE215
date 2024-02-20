package Chapter2;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();
        System.out.println(String.format("%,.1f",miles) + " miles is "+ String.format("%,.1f",(miles*1.6)) + " kilometers");

    }
}
