class Solution {
    public int fib(int n) {

        if(n == 0 || n == 1){
            return n;
        }
        // int fibn1 = fib(n-1);
        // int fibn2 = fib(n-2); 
        return fib(n-1) + fib(n-2);
    }
}