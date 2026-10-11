class Solution {
    public int longestConsecutive(int[] nums) {
        // int ans = 0;
        // HashSet<Integer> set = new HashSet<>();

        // for(int x : nums){
        //     set.add(x);
        // }

        // for(int x : set){

        //     if(!set.contains(x-1)){
        //         int curr = x;
        //         int length = 1;

        //         while(set.contains(curr+1)){
        //             curr++;
        //             length++;
        //         }
        //         ans = Math.max(ans,length);
        //     }

            
        // }
        // return ans;

        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        int longest = 1;

        for(int i=1;i<=nums.length-1;i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] == nums[i-1] + 1){
                count++;
            }
            else{
                count = 1;
            }
        
        if(count > longest){
            longest = count;
        }
        }
        return longest;
    }
}