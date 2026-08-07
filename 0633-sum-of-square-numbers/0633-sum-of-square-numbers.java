class Solution {
    public boolean judgeSquareSum(int c) {
        int r = (int) Math.sqrt(c);
        int i=0;
        int j=r;
        while(i<=j)
        {
             long v =(long)i*i + (long)j*j;
            if(v<c)
            {
                i++;
            }
            else if(v>c)
            {
                j--;
            }
            else{
                return true;
            }
        }
        return false;
    }
}