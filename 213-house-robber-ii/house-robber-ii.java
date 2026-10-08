class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int[] temp1 = new int[nums.length];
        int[] temp2 = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i!=0){
                temp1[i] = nums[i];
            }
            if(i!=nums.length-1){
                temp2[i] = nums[i];
            }
        }
        return Math.max(moneyrob(temp1),moneyrob(temp2));
    }
    static int moneyrob(int[] arr){
        int prev = arr[0];
        int prev2 = 0;
        for(int i=1;i<arr.length;i++){
            int take = arr[i];
            if(i > 1){
                take+=prev2;
            }
            int nottake = prev;
            int curr = Math.max(take,nottake);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}