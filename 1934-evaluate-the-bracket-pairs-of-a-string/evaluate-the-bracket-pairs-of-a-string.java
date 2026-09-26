class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        StringBuilder ans = new StringBuilder();
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='('){
                int k = j+1;
                while(s.charAt(k)!=')'){
                    k++;
                }
                String key = s.substring(j+1,k);
                ans.append(map.getOrDefault(key, "?"));
                j=k;
            }else{
                ans.append(s.charAt(j));
            }
        }
        return ans.toString();
    }
}