package Chapter1;

public class Problem10 {
    public static void main(String[] args) {
        int h,m,s,ts;
        double distance;
        double speed_s;
        double speed_h;
        h = 0;
        m = 50;
        s = 30;
        distance = 15; //km
        ts = h*60*60 + m*60 + s;
        distance = distance/1.6; //miles
        speed_s = distance / ts;
        speed_h = speed_s *60*60;
        System.out.println("Average speed = " + speed_h + "miles per hour");

    }
}
