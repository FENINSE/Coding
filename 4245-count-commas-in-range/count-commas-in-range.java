class Solution {
    public int countCommas(int n) {
        //int len = (int)Math.log(n) + 1;
        //System.out.print(len);
        if(n < 1000){
            return 0;
        }else{
            int rem = n-1000;
            return rem + 1;
        }
    }
}