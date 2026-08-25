class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i< nums.length;i++){
            set.add(nums[i]);
        }
        int j = 1;
        int size = set.size();
        while(true){
            int mul = j*k;
            set.add(mul);
            if(set.size() > size){
                return mul;
            }
            j++;
        }
    }
}