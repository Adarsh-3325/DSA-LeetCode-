class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        arr[0] = 1;
        for(int i=1;i<n;i++){
            int a = Math.abs(arr[i] - arr[i-1]);

            if(a > 1){
                arr[i] = arr[i-1]+1;
            }
        }
        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
}