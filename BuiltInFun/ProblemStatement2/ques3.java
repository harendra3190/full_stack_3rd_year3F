import java.util.*;

public class ques3 {
    public static boolean prime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (prime(n)) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}
