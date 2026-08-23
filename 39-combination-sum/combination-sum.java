class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        find(candidates,target,0,new ArrayList<>(),list);
        return list; 
    }
    static void find(int[] candidates,int target,int index,List<Integer> current, List<List<Integer>> list){
        if(target == 0){
            list.add(new ArrayList<>(current));
            return;
        }if(target < 0){
            return;
        }
    for(int i=index;i<candidates.length;i++){
        if(candidates[i] <= target){
        current.add(candidates[i]);
        find(candidates,target-candidates[i],i,current,list);
        current.remove(current.size()-1);
    }
    }
    return;
    }
}