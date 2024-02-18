package homework;

import java.lang.Math;

public class Problem4 {

    public static void main(String[] args) {
        System.out.println("a    a^2   a^3   a^4");
        for(int i =1; i <= 4; i++){
            for (int j =1; j<=4;j++) {
                System.out.print((int) Math.pow(i, j) + "    ");
            }
            System.out.println();
        }
    }
}
