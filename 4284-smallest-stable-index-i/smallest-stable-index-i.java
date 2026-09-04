class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int max = nums[0];

        int minarr[] = new int[n];
        minarr[n-1] = nums[n-1];

        for(int i=n-2;i>=0;i--){
            minarr[i] = Math.min(nums[i], minarr[i+1]);
        }
        for(int i=0;i<n;i++){
            max = Math.max(max,nums[i]);

            int res = max-minarr[i];
            if(res <= k){
                return i;
            }
        }
        return -1;
    }
}