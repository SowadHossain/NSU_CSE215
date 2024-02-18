package homework;

public class Problem11 {
    public static void main(String[] args) {
        int seconds;
        int population,newBorns,deaths,imigrants;
        seconds = 356*12*60;
        population = 313_032_486;
        newBorns = seconds/7;
        deaths = seconds/13;
        imigrants = seconds/45;
        for(int i = 1;i<= 5; i++){

            population = population+newBorns-deaths+imigrants;
            System.out.println("Year " + i + " = " + population);
        }




    }
}
