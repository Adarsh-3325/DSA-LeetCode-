class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int end = nums.length -1;
        int k =0;

        while(k<=end){
            //int mid = (start+end)/2;
            if(nums[k]==0){
                int temp = nums[start];
                nums[start]=nums[k];
                nums[k]=temp;
                start++;
                k++;
            }
            else if(nums[k]==1){
                k++;
            }
            else{
                int temp=nums[k];
                nums[k]=nums[end];
                nums[end]=temp;
                end--;
            }
        }
        
    }
}