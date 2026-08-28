class Solution {
    public int[] shuffle(int[] nums, int n) {
        int y = n;
        int s = 0;
        int[] arr = new int[2*n];
        for(int i=0;i<arr.length;i+=2){
            arr[i]=nums[s];
            arr[i+1] = nums[y];
            y++;
            s++;
        }
        return arr;
    }
}