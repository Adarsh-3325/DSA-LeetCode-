class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];

        int max = 0;
        for(int i=0;i<n;i++){
                max = Math.max(nums[i],max);
                prefix[i] = gcd(nums[i],max);
            

            
        }
        Arrays.sort(prefix);

        long sum = 0;
        int left = 0;
        int right = n -1;
        while(left < right){
            sum += gcd(prefix[left], prefix[right]);
            left++;
            right--;
            
            }
        return sum;
    }
    public int gcd(int a, int b){
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

}