class Solution {
    public long sumAndMultiply(int n) {
        if(n == 0) return 0;

        List<Integer> list = new ArrayList<>();

        while(n > 0){
            int digit = n % 10;
            if(digit != 0){
                list.add(digit);
            }
            n /= 10;
        }

        Collections.reverse(list);

        long sum = 0;
        long num = 0;

        for(int a : list){
            sum += a;
            num = num * 10 + a;
        }
        return sum * num;
    }
}