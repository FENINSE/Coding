class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> list  = triangle.get(triangle.size() - 1);
        int n = list.size();
        int[] dp = new int[n];
        for(int j=0;j<n;j++){
            dp[j] = list.get(j);
        }
        for(int i=n-2;i>=0;i--){
            int[] temp = new int[n];
            for(int j=i;j>=0;j--){
                int up = triangle.get(i).get(j) + dp[j];
                int dg = triangle.get(i).get(j) + dp[j+1];
                temp[j] = Math.min(up,dg);
            }
            dp = temp;
        }
        return dp[0];
    }
}