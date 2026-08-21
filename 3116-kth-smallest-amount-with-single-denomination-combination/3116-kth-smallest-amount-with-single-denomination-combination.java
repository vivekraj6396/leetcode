class Solution {
    public long findKthSmallest(int[] coins, int k){
        long small=1;
        long high=(long)coins[0]*k;
        for(int i=1;i<coins.length;i++)
        {
            high=Math.min(high,(long)coins[i]*k);
        }
        while(small<high)
        {
            long mid=(small+high)/2;
            long count=0;
            for(int i=1;i<(1<<coins.length);i++)
            {
                long lcm=1;
                int c=0;
                boolean flag=true;
                for(int j=0;j<coins.length;j++)
                {
                    if((i&(1<<j))!=0)
                    {
                        c++;

                        long g=gcd(lcm,coins[j]);

                        lcm=lcm/g*coins[j];

                        if(lcm>mid)
                        {
                            flag=false;
                            break;
                        }
                    }
                }
                if(flag)
                {
                    if(c%2==1)
                    {
                        count=count+mid/lcm;
                    }
                    else
                    {
                        count=count-mid/lcm;
                    }
                }
            }
            if(count>=k)
            {
                high=mid;
            }
            else
            {
                small=mid+1;
            }
        }
        return small;
    }
    public long gcd(long a,long b)
    {
        while(b!=0)
        {
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}