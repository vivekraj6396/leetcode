class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob, String leaveBob) {
        int a=Math.max(toDays(arriveAlice),toDays(arriveBob));
        int b=Math.min(toDays(leaveAlice),toDays(leaveBob));
        if(a>b)
        {
            return 0;
        }
        return b-a+1;
    }
    public int toDays(String s) {
        int month=Integer.parseInt(s.substring(0,2));
        int day=Integer.parseInt(s.substring(3,5));
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int total=day;
        for(int i=0;i<month-1;i++)
        {
            total+=days[i];
        }
        return total;
    }
}