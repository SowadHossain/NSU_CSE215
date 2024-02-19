package Chapter1;

public class Problem7 {
    public static void main(String[] args) {
        double sum = 0;

        for(int i = 1 , j = 1; i<=150;i+=2,j++){
            if(j%2 == 1)
                sum +=  1 /(double)i;
            else
                sum -= 1 /(double)i;
        }
        System.out.println("Result="+ 4* sum);
    }
}
