import java.util.*;

public class ques5 {
    public static boolean pal(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equalsIgnoreCase(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (pal(s)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
