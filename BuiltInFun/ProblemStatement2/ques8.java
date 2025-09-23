import java.util.*;

public class ques8 {
    public static double toC(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double toF(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        String u = sc.next();
        if (u.equalsIgnoreCase("C")) System.out.println(toF(t));
        else System.out.println(toC(t));
    }
}
