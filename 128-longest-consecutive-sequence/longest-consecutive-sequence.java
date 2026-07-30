class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int x : nums){
            set.add(x);
        }

        for(int x : set){

            if(!set.contains(x-1)){
                int curr = x;
                int length = 1;

                while(set.contains(curr+1)){
                    curr++;
                    length++;
                }
                ans = Math.max(ans,length);
            }

            
        }
        return ans;
    }
}