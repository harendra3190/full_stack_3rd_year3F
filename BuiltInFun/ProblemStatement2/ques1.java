import java.util.*;

public class ques1 {
    public static int getGuess(int low, int high) {
        Random r = new Random();
        return r.nextInt(high - low + 1) + low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        boolean found = false;
        while (!found) {
            int guess = getGuess(low, high);
            System.out.println("My guess: " + guess);
            String res = sc.next();
            if (res.equalsIgnoreCase("low")) low = guess + 1;
            else if (res.equalsIgnoreCase("high")) high = guess - 1;
            else if (res.equalsIgnoreCase("correct")) {
                System.out.println("I got it!");
                found = true;
            }
        }
    }
}
