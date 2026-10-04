class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length;
        int freq[]=new int[n];
        for(int i=0;i<n;i++) 
        {
            if(nums[i]>n-1 || nums[i]<1)
            {
                return false;
            } 
            freq[nums[i]]++;
        }
        if(freq[n-1]!=2)
        {
            return false;
        }   
        for(int i=1;i<n-1;i++) 
        {
            if(freq[i]!=1)
            {
               return false; 
            }
            
        }
        return true;
    }
}