class Solution {
    public int maxProduct(int n) {
        String s = String.valueOf(n);
        int arr[] = new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i] = Character.getNumericValue(s.charAt(i));
        }
        Arrays.sort(arr);

        int pr = 1;
        pr = arr[arr.length-1] * arr[arr.length-2];
        return pr;
    }
}