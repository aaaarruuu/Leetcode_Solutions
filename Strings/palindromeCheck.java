import java.util.*;

class palindromeCheck{
    public static void main(String[]agrs) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(isPalindrome(s));
        sc.close();
    }

    static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = 0, r = s.length() -1;
        while ( l < r) if(s.charAt(l++) != s.charAt(r--)) return false;
        return true;
    }
}
