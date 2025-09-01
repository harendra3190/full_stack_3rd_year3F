
public class StringComparison {
    public static void main(String[] args) {
        
        //1

        // String s1 = "Harsh";
        // String s2 = "harsh";
        // if (s1.equals(s2)) {
        //     System.out.println("Case-sensitive: Strings are equal");
        // } else {
        //     System.out.println("Case-sensitive: Strings are not equal");
        // }

        // if (s1.equalsIgnoreCase(s2)) {
        //     System.out.println("Case-insensitive: Strings are equal");
        // } else {
        //     System.out.println("Case-insensitive: Strings are not equal");
        // }


        //2

        // String s = "harsh";
        // String result = "";

        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //     if (ch >= 'a' && ch <= 'z') {
        //         ch = (char)(ch - 32);
        //     }
        //     result = result + ch;
        // }

        // System.out.println("Uppercase: " + result);


        //3

        // String s = "My Name is Harsh Sharma";
        // int count = 0;

        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.toLowerCase().charAt(i);
        //     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        //         count++;
        //     }
        // }

        // System.out.println("No. of vowels: " + count);


        //4

        // String s = "Harsh Sharma GLA";
        // int count = 0;
        // char[] ch = s.toCharArray();
        // for(char c: ch){
        //     count++;
        // }
        // System.out.println("No. of characters: " + count);


        //5

        // String s = "kanak";
        // boolean isPalindrome = true;

        // for (int i = 0; i < s.length() / 2; i++) {
        //     if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
        //         isPalindrome = false;
        //         break;
        //     }
        // }

        // if (isPalindrome) {
        //     System.out.println("Palindrome");
        // } else {
        //     System.out.println("Not a palindrome");
        // }


        //6

        // String str = "swiss";
        // boolean found = false;

        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     int count = 0;

        //     for (int j = 0; j < str.length(); j++) {
        //         if (ch == str.charAt(j)) {
        //             count++;
        //         }
        //     }

        //     if (count == 1) {
        //         System.out.println("First non-repeating character: " + ch);
        //         found = true;
        //         break;
        //     }
        // }

        // if (!found) {
        //     System.out.println("No non-repeating character found.");
        // }


        //7

        // String str = "Today is a rainy day";
        // StringTokenizer st = new StringTokenizer(str);
        // int count = st.countTokens();

        // System.out.println("Number of words: " + count);


        //8

        // String str = "Hello World Java";
        // String result = "";

        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if (ch == ' ') {
        //         result = result + '-';
        //     } else {
        //         result = result + ch;
        //     }
        // }

        // System.out.println("After replacing spaces: " + result);


        //9

        String str = "Java";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            System.out.println(ch + " : " + ascii);
        }

    }
    
}