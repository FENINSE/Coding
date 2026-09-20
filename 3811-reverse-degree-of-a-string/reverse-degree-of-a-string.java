class Solution {
    public int reverseDegree(String s) {
        String alpha = "zyxwvutsrqponmlkjihgfedcba";
        int sum = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int index = alpha.indexOf(ch)+1;
            sum+=(index * (i+1));
        }
        return sum;
    }
}