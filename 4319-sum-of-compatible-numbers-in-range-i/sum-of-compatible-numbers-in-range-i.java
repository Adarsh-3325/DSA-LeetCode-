class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sum = 0;
        int limit = Math.abs(n+k);
        for(int x=1;x<=limit;x++){
            int a = Math.abs(n-x);
            int bit = (n & x);
            if(a<=k && bit == 0){
                sum += x;
            }
        }
        return sum;
    }
}