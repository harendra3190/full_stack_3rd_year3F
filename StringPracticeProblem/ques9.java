import java.util.*;

public class ques9 {
    public static char freq(String s) {
        int[] arr = new int[256];
        for (char ch : s.toCharArray()) arr[ch]++;
        int max = 0; char res = ' ';
        for (char ch : s.toCharArray()) {
            if (arr[ch] > max) {
                max = arr[ch];
                res = ch;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(freq(s));
    }
}
