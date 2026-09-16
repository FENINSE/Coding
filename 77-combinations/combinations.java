class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> main = new ArrayList<>();
        ArrayList<Integer> sub = new ArrayList<>();
        combination(1,n,main,sub,k);
        return main;
    }
    static void combination(int start, int n,List<List<Integer>> main, ArrayList<Integer> sub,int k){
        if(sub.size()==k){
            main.add(new ArrayList<>(sub));
            return;
        }
        for(int i=start;i<=n;i++){
            sub.add(i);
            combination(i+1,n,main,sub,k);
            sub.remove(sub.size()-1);
        }
    }
}