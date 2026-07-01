import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next().toLowerCase();
        int v = 0, c = 0;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') v++;
            else c++;
        }
        System.out.println("Number of Vowels are : " + v + " and " + "Number of consonents are : " + c);
        sc.close();
    }
}