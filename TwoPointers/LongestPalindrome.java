public class LongestPalindrome {

     public String longestPalindrome(String s) {
            //s = "babad";
            if (s == null || s.isEmpty()) return s;
            String longest = "";
            int left = 0;
            int max = 0;
            for (int right = 0; right < s.length(); right++) {
                //如果不是回文串，left左移
                if (longest.length() > 1 && longest.charAt(0) != s.charAt(right)){
                    left++;
                }
                if (right-left+1 > max){
                    max = Math.max(max, right-left+1);
                    longest = s.substring(left, right-left+1);
                }
            }
            System.out.println(longest);
            return longest;
        }
}
