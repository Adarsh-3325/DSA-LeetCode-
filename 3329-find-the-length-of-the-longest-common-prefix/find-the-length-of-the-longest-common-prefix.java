class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            while(arr1[i] > 0){
            set.add(arr1[i]);
            arr1[i] /= 10;
            }
        }
        int ans = 0;

        for(int i=0;i<arr2.length;i++){
            while(arr2[i] > 0){
                if(set.contains(arr2[i])){
                    ans = Math.max(ans,String.valueOf(arr2[i]).length());
                    break;
                }
                arr2[i] /= 10;
            }
        }
        return ans;
    }
}