package dynamic;

import java.util.Vector;

public class OddSum1524 {
    public  static void main(String[] args) {
        int[] arr = new int[]{1,3,5};
        System.out.println(getOddSumOfSubarr(arr));
    }

    private static long getOddSumOfSubarr(int[] arr) {
        int mod = (int) (1e9 + 7);
        long ans = 0l, odd = 0l, even = 0l;
        int n = arr.length;
        for (int x:arr) {
            if (x % 2 == 1) {
                long temp = even;
                even = odd;
                odd = temp + 1;
            } else {
                odd = odd;
                even += 1;
            }
            ans = (ans + odd) ;
        }
        return ans%mod;
    }
}
