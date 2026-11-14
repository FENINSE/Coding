class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        if(ans.length==1){
            return ans;
        }
        ans[1] = 1;
        if(n >= 2){
            for(int i=2;i<=n;i++){
                int q = i/2;
                if(i%2==0){
                    ans[i] = ans[q];
                }else{
                    ans[i] = ans[q] + ans[1];
                }
            }
        }
        return ans;
    }
}