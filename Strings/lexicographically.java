
import java.util.Scanner;

class lexicographically{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int res = s1.compareTo(s2);

        if(res == 0) System.out.println("Strings are Equal");
        else if(res < 0) System.err.println(s1 + " is Smaller than " + s2);
        else System.err.println( s2 + " is Smaller than " + s1);

        sc.close();
    }
}