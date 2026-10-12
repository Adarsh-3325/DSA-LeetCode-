class Solution {
    public int sumOfSquares(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                list.add(nums[i-1]);
            }
        }

        int sum = 0;
        for(int i=0;i<list.size();i++){
            sum += list.get(i) * list.get(i);
        }
        return sum;
    }
}