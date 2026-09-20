class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       Arrays.sort(candidates);
       List<List<Integer>> list = new ArrayList<>();
       ArrayList<Integer> current = new ArrayList<>();
       findcomb(candidates, target, list,current,0); 
       return list;
    }
    static void findcomb(int[] arr,int target,List<List<Integer>> list,ArrayList<Integer> current,int start){
        if(target==0){
            list.add(new ArrayList<>(current));
            return;
        }
        if(target < 0){
            return;
        }
        for(int i = start;i<arr.length;i++){
            if(i > start && arr[i]==arr[i-1]){
                continue;
            }
            current.add(arr[i]);
            findcomb(arr,target-arr[i],list,current,i+1);
            current.remove(current.size()-1);
        }
    }
}