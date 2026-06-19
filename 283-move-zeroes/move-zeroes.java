class Solution {
    public void moveZeroes(int[] nums) {
        int set = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[set];
                nums[set] = nums[i];
                nums[i] = temp;
                set++;
            }
        }
    }
}