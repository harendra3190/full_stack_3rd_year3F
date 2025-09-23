import java.util.*;

public class ques2 {
    public static String rev(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) r += s.charAt(i);
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(rev(s));
    }
}
