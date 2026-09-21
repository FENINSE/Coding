class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int third_max = 0;
        int max_number = nums[nums.length-1];
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=nums.length-1;i>=0;i--){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                third_max = nums[i];
                count++;
            }
            if(count==3){
                return third_max;
            }
        }
        return max_number;
    }
}