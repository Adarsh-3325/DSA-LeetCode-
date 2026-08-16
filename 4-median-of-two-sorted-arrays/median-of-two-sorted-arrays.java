class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int arr[] = new int[m+n];

        for(int i=0;i<m;i++){
            arr[i] = nums1[i];
        }
        for(int i=0;i<n;i++){
            arr[m+i] = nums2[i];
        }
        Arrays.sort(arr);

        int a = m+n;
        if(a % 2 != 0){
            int mid = (m+n)/2;
            return arr[mid];
        }

        int midel = (m+n)/2;
        double res = (arr[midel] + arr[midel-1])/2.0;
        return res;
    }
}