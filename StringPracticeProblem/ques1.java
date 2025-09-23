import java.util.*;

public class ques1 {
    public static void count(String s) {
        s = s.toLowerCase();
        int v = 0, c = 0;
        for (char ch : s.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) v++;
            else if (Character.isLetter(ch)) c++;
        }
        System.out.println("Vowels: " + v + ", Consonants: " + c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        count(s);
    }
}
