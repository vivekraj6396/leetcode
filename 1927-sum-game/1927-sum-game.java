class Solution {
    public boolean sumGame(String num) {

        int sum1=0;
        int sum2=0;
        int count1=0;
        int count2=0;

        for(int i=0;i<num.length()/2;i++)
        {
            if(num.charAt(i)=='?')
            {
                count1++;
            }
            else
            {
                sum1=sum1+(num.charAt(i)-'0');
            }
        }

        for(int i=num.length()/2;i<num.length();i++)
        {
            if(num.charAt(i)=='?')
            {
                count2++;
            }
            else
            {
                sum2=sum2+(num.charAt(i)-'0');
            }
        }

        int q=Math.abs(count1-count2);

        if(q%2==1)
        {
            return true;
        }

        if(sum1-sum2==9*(count2-count1)/2)
        {
            return false;
        }

        return true;
    }
}