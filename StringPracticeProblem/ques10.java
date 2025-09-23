import java.util.*;

public class ques10 {
    public static String removeChar(String s, char ch) {
        String r = "";
        for (char c : s.toCharArray()) if (c != ch) r += c;
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        System.out.println(removeChar(s, ch));
    }
}
