class Solution {
    public int minMoves(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        int j = 0;
        int move = 0;
        while(j < nums.length){
            if(nums[j]==max){
                j++;
            }else{
                nums[j] = nums[j]+1;
                move++;
            }
        }
        return move;
    }
}