import java.util.*;

public class ques8 {
    public static int cmp(String a, String b) {
        int n = Math.min(a.length(), b.length());
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) return a.charAt(i) - b.charAt(i);
        }
        return a.length() - b.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int r = cmp(a, b);
        if (r < 0) System.out.println(a + " comes before " + b);
        else if (r > 0) System.out.println(b + " comes before " + a);
        else System.out.println("Both are equal");
    }
}
