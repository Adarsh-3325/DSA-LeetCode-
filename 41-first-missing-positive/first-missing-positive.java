
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        
        // for (int i = 0; i < n; i++) {
        //     while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                
        //         int temp = nums[nums[i] - 1];
        //         nums[nums[i] - 1] = nums[i];
        //         nums[i] = temp;
        //     }
        // }

       
        // for (int i = 0; i < n; i++) {
        //     if (nums[i] != i + 1) {
        //         return i + 1;
        //     }
        // }

       
        // return n + 1;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        int min = Integer.MAX_VALUE;
        for(int i=1;i<=n+1;i++){
            if(!map.containsKey(i)){
                min = Math.min(min,i);
            }
        }
        return min;
    }
}
