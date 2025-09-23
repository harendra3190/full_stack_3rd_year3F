import java.util.*;

public class ques6 {
    public static int count(String s, String sub) {
        int c = 0, i = 0;
        while ((i = s.indexOf(sub, i)) != -1) {
            c++;
            i += sub.length();
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String sub = sc.nextLine();
        System.out.println(count(s, sub));
    }
}
