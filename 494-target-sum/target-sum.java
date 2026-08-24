class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int index = 0;
        int sum = 0;
        int n=targetsum(nums,index,sum,target);
        return n;
    }
    static int targetsum(int[] nums,int index,int sum,int target){
        if(index==nums.length){
            if(sum==target){
                return 1;
            }else{
                return 0;
            }
        }
            int total1=targetsum(nums,index+1,sum+nums[index],target);
            int total2=targetsum(nums,index+1,sum-nums[index],target);
        
        return total1+total2;
    }
}