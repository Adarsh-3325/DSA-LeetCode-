class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        
        for(int i=0;i<n;i++){
            ans[i] = nums[i];
        }
        
        for(int i=n,j=n-1;i<ans.length;i++,j--){
            ans[i] = nums[j];
        }
        return ans;
    }
}