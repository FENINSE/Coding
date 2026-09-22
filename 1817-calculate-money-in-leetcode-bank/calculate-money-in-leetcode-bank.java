class Solution {
    public int totalMoney(int n) {
        int total_money = 0;
        int day_inc = 1;
        int week_inc = 0;
        for(int i=1;i<=n;i++){
            total_money += day_inc+week_inc;
            day_inc++;
            if(i%7==0){
                week_inc++;
                day_inc = 1;
            }
        }
        return total_money;
    }
}