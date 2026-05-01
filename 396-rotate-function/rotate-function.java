class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int max = 0;
        int sum = 0;

        for(int i=0;i<n;i++){
            sum += nums[i];
            max += i * nums[i];
        }
        int val = max;

        for(int i=1;i<n;i++){
            max = max + sum - n * nums[n-i];
            val = Math.max(val,max);
        }
        return val;
    }
}