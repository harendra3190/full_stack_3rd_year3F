import java.util.*;

public class ques5 {
    public static String longest(String s) {
        String[] words = s.split(" ");
        String max = "";
        for (String w : words) if (w.length() > max.length()) max = w;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(longest(s));
    }
}
