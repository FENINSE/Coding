class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] ch = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i=0;i<ch.length;i++){
            String s = ch[i] + "";
            if(!sentence.contains(s)){
                return false;
            }
        }
        return true;
    }
}