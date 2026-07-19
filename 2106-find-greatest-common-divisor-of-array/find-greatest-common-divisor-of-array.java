class Solution {
    public int findGCD(int[] nums) {
        
        // Arrays.sort(nums);
        // return gcd(nums[0], nums[nums.length-1]);

        int min = nums[0];
        int max = nums[0];

        for(int i=0;i<nums.length;i++){
            if(max < nums[i]){
                max = nums[i];
            }
            if(min > nums[i]){
                min = nums[i];
            }
        } 
        return gcd(max,min);
    }
    private int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}