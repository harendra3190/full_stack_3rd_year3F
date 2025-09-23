import java.util.*;

public class ques11 {
    public static boolean anagram(String a, String b) {
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x, y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if (anagram(a, b)) System.out.println("Anagram");
        else System.out.println("Not Anagram");
    }
}
