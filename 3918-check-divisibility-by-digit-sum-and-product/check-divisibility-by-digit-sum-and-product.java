class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum = 0;
        int product = 1;
        while(temp > 0){
            int rem = temp % 10;
            sum = sum + rem;
            product = product * rem;
            temp = temp /10;
        }
        int s = sum + product;
        if(n % s == 0){
            return true;
        }
        return false;
    }
}