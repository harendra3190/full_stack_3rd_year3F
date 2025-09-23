import java.util.*;

public class ques9 {
    public static int add(int a, int b) { return a + b; }
    public static int sub(int a, int b) { return a - b; }
    public static int mul(int a, int b) { return a * b; }
    public static double div(int a, int b) { return (double) a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String op = sc.next();
        switch (op) {
            case "+": System.out.println(add(a, b)); break;
            case "-": System.out.println(sub(a, b)); break;
            case "*": System.out.println(mul(a, b)); break;
            case "/": System.out.println(div(a, b)); break;
            default: System.out.println("Invalid");
        }
    }
}
