class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = nums[0];
        int smalleststable = -1;
        for(int i=0;i<nums.length;i++){
            max = Math.max(nums[i],max);
            int min = minimum(nums,i);
            if(max-min <= k){
                return i;
            }
        }
        return smalleststable;
    }
    static int minimum(int[] arr,int i){
        int minimum = arr[i];
        for(int j=i;j<arr.length;j++){
            minimum = Math.min(arr[j],minimum);
        }
        return minimum;
    }
}