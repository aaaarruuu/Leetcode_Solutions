import java.util.*;
class secondLargest{
    public static int secondLargest(int[] arr) {
        long f = Long.MIN_VALUE;
        long s = Long.MIN_VALUE;

        for(int x : arr){
            if ( x > f) {
                s = f;
                f = x;
            }
            else if(f > x && x > s) s = x;
        }
        return (int) s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = secondLargest(arr);

        if (res == -1) System.out.println("Not Exists");
        else System.err.println("Second largest Element: " + res );
    }
}