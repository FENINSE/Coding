class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> list = new ArrayList<>();
        pad("",digits,list);
        return list;
    }
    static ArrayList<String> pad(String p,String s,ArrayList<String> list){
        if(s.isEmpty()){
            list.add(p);
            return list;
        }
        int digit = s.charAt(0)-'0';
        int start = (digit-2)*3;
        int end = start + 3;
        if(digit==7){
            start = (digit-2)*3;
            end = start + 4;
        }
        if(digit==8){
            start = (digit-2)*3 + 1;
            end = start + 3;
        }
        if(digit==9){
            start = (digit-2)*3 + 1;
            end = start+4;
        }
        for(int i=start;i<end;i++){
            char ch = (char) ('a'+ i);
            pad(p+ch,s.substring(1),list);
        }
        return list;
    }
}