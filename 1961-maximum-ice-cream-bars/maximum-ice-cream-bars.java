class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int currcoins = coins;
        int ans = 0;
        Arrays.sort(costs);
        for(int i=0;i<costs.length;i++){
            if(costs[i] <= currcoins){
                currcoins -= costs[i];
                ans += 1;
            }
        }
        return ans;
    }
}