package leetCode;

public class UniquePaths {
    public static void main(String[] args) {
        Solution25 solution = new Solution25();
        int m = 4;
        int n = 4;
        System.out.println(solution.uniquePaths(m, n));
    }

}

class Solution25 {
    public int dfs(int R, int C, int row, int col, int [][]dp){
        if(row>R || col>C){
            return 0;
        }
        if(dp[row-1][col-1]!=0){
            return dp[row-1][col-1];
        }
        if(row==R && col==C){
            return 1;
        }
        int down = dfs(R,C,row+1,col,dp);
        int right = dfs(R,C,row,col+1,dp);

        dp[row-1][col-1] = down+right;
        return dp[row-1][col-1];
    }

    public int uniquePaths(int m, int n) {
        // m -> rows -> R
        // n -> cols -> C
        int[][]dp = new int[m][n];
        dp[m-1][n-1]=1;
        return dfs(m,n,1,1,dp);
    }
}

