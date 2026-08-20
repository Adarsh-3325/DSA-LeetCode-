class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();

        nums1.add(nums[0]);
        nums2.add(nums[1]);

        for(int i=2;i<nums.length;i++){
            int last1 = nums1.get(nums1.size()-1);
            int last2 = nums2.get(nums2.size()-1);

            if(last1 > last2){
                nums1.add(nums[i]);
            }
            else{
                nums2.add(nums[i]);
            }
        }

        int result[] = new int[nums.length];
        int i=0;

        for(int num : nums1){
            result[i++] = num;
        }

        for(int num : nums2){
            result[i++] = num;
        }

        return result;
    }
}