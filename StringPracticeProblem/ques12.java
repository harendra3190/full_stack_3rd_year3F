import java.util.*;

public class ques12 {
    public static String replaceWord(String s, String oldW, String newW) {
        return s.replaceAll(oldW, newW);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String oldW = sc.next();
        String newW = sc.next();
        System.out.println(replaceWord(s, oldW, newW));
    }
}
