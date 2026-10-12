class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int m=1000000007;
        int count[]=new int[31];
        for(int i=0;i<nums.size();i++) 
        {
            int num=nums.get(i);
            for(int j=0;j<31;j++) 
            {
                if((num &(1<<j))!=0) 
                {
                    count[j]++;
                }
            }
        }
        long ans=0;
        for(int i=0;i<k;i++) 
        {
            long num=0;
            for(int j=0;j<31;j++) 
            {
                if(count[j]>0) 
                {
                    num=num|(1L<<j);
                    count[j]--;
                }
            }
            ans=(ans+num*num)%m;
        }
        return (int)ans;
    }
}