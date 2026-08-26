class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        int f = 0;
        int s = 0;
        for(int i=0;i<ans.length;i++){
            if(f < nums.length){
                ans[i] = nums[f];
                f++;
            }else if(s<nums.length){
                ans[i] = nums[s];
                s++;
            }
        }
        return ans;
    }
}