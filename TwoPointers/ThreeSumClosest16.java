public class ThreeSumClosest16 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,2,1,-4};
        System.out.println(threeSumClosest(nums, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int length = nums.length;
        int min = Integer.MAX_VALUE;
        int right = length-1;
        int sum = 0;
        for (int i = 0; i < length-2; i++) {
            int left = i+1;
            while (left <right ){
                int temp = nums[i] + nums[left] + nums[right];
                int differ = Math.abs(temp-target);
                if (differ < min){
                    min = differ;
                    sum = temp;
                }
                right--;
            }
        }
        return sum;
    }
}
