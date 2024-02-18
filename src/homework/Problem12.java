package homework;

public class Problem12 {
    public static void main(String[] args) {
        int h,m,s,ts;
        double distance;
        double speed_s;
        double speed_h;
        h = 1;
        m = 40;
        s = 35;
        distance = 24; //miles
        ts = h*60*60 + m*60 + s;
        distance = distance*1.6; //km
        speed_s = distance / ts;
        speed_h = speed_s *60*60;
        System.out.println("Average speed = " + speed_h + "km per hour");

    }
}
