import java.util.*;

class Solution {
    public int minimumDeletion(int[] nums, int[] numsDivide) {
        int g = numsDivide[0];
        for (int i = 1; i < numsDivide.length; i++) {
            g = gcd(g, numsDivide[i]);
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (g % nums[i] == 0) {
                return i;
            }
            while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return -1;
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        int[] numsDivide = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            numsDivide[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        int res = sol.minimumDeletion(nums, numsDivide);
        System.out.println(res);

        sc.close();
    }
}