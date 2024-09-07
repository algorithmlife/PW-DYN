import java.util.Arrays; 

public class HouseRobberII {

    public static int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        return Math.max(robLinear(Arrays.copyOfRange(nums, 0, nums.length - 1)),
                        robLinear(Arrays.copyOfRange(nums, 1, nums.length)));
    }

    private static int robLinear(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }
        
        return dp[n-1];
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 2};
        int[] nums2 = {1, 2, 3, 1};
        int[] nums3 = {1, 2, 3};

        System.out.println(rob(nums1));  
        System.out.println(rob(nums2));  
        System.out.println(rob(nums3)); 
    }
}
