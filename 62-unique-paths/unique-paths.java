class Solution {
    public int uniquePaths(int m, int n) {
    //     int grid[][] = new int[m][n];
    //     int ways = path(grid,0,0);
    //     return ways;
    // }
    // public int path(int grid[][], int down, int right){
    //     if(down == grid.length - 1 && right == grid[0].length - 1){
    //         return 1;
    //     }
    //     int count =0;
    
    //    if(isSafe(grid,down+1,right)){
    //     count += path(grid,down+1,right);
    //    }
    //    if(isSafe(grid,down,right+1)){
    //     count += path(grid,down,right+1);
    //    }
    //    return count;
    // }
    // public boolean isSafe(int grid[][], int i, int j){
    //     if(i<0 || j<0 || i>=grid.length || j>=grid[0].length){
    //         return false;
    //     }
    //     return true;

    int dp[][] = new int[m][n];
    for(int i=0;i<m;i++){
     Arrays.fill(dp[i],-1);
    }

    return path(dp,0,0);

    }

        public int path(int dp[][], int down, int right){
            if(down == dp.length-1 && right == dp[0].length-1){
                return 1;
            }
            // if(down > dp.length-1 || right > dp[0].length-1){
            //     return 0;
            // }

            if(dp[down][right] != -1){
                return dp[down][right];
            }
            int count = 0;

            if(down+1 < dp.length){
                count += path(dp,down+1,right);
            }
            if(right+1 < dp[0].length){
                count += path(dp,down,right+1);
            }

            dp[down][right] = count;
            return count;
        }
    
}