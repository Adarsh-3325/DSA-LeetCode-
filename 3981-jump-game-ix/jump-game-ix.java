class Solution {
    public int[] maxValue(int[] nums) {
        int n = nums.length;

        int ans[] = new int[n];
        int prefixmax[] = new int[n];

        prefixmax[0] = nums[0];

        for(int i=1;i<n;i++){
            prefixmax[i] = Math.max(prefixmax[i-1],nums[i]);
        }
        
        int min = Integer.MAX_VALUE;

        for(int i=n-1;i>=0;i--){
            if(i == n-1 || prefixmax[i] <=min){
                ans[i] = prefixmax[i];
            }else{
                ans[i] = ans[i+1];
            }
            
                min = Math.min(min,nums[i]);
            
        }
        return ans;
    }
}