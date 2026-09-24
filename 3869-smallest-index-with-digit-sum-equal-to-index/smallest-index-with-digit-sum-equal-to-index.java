class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i<n){
            int temp = nums[i];
            int sum = 0;

            while(temp > 0){
                int rem = temp % 10;
                sum += rem;
                temp /= 10;
            }
            if(sum == i){
                return i;
            }
            i++;
        }
        return -1;
    }
}