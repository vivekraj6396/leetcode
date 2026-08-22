class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int num=n;
        while(n>0)
        {
            int m=n%10;
            n=n/10;
            sum=sum+m;
            product=product*m;
        }
        if(num%(sum+product)==0)
        {
            return true;
        }
        return false;
    }
}