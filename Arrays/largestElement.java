import java.util.*;

class largestElement{
    static int largestElement(int[] arr ) {
        int m = arr[0];
        for( int x : arr) if ( x > m ) m = x;
        return m;
    }

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }

        int res = largestElement(arr);

        if(res == -1) System.out.println("no number");
        else System.out.println("largest element: " + res);
    }
}