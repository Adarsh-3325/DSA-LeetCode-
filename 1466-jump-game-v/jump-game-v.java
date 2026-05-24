class Solution {

    public int maxJumps(int[] arr, int d) {

        int n = arr.length;
        int[] dp = new int[n];

        int ans = 1;

        for(int i = 0; i < n; i++) {
            ans = Math.max(ans, dfs(arr, d, i, dp));
        }

        return ans;
    }

    private int dfs(int[] arr, int d, int idx, int[] dp) {

        if(dp[idx] != 0)
            return dp[idx];

        int best = 1;

        
        for(int j = idx + 1; j <= Math.min(arr.length - 1, idx + d); j++) {

            
            if(arr[j] >= arr[idx])
                break;

            best = Math.max(best, 1 + dfs(arr, d, j, dp));
        }

    
        for(int j = idx - 1; j >= Math.max(0, idx - d); j--) {

            
            if(arr[j] >= arr[idx])
                break;

            best = Math.max(best, 1 + dfs(arr, d, j, dp));
        }

        return dp[idx] = best;
    }
}