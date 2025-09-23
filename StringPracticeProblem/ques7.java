import java.util.*;

public class ques7 {
    public static String toggle(String s) {
        String r = "";
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) r += Character.toLowerCase(ch);
            else if (Character.isLowerCase(ch)) r += Character.toUpperCase(ch);
            else r += ch;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(toggle(s));
    }
}
