class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        Arrays.sort(nums);
        int count=1;
        int c=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-nums[i-1]==1)
            {
                count++;
            }
            else if(nums[i]-nums[i-1]==0)
            {
                continue;
            }
            else{
                if(c<count)
                {
                    c=count;
                }
                count=1;
            }
            if(c<count)
                {
                    c=count;
                }
        }
        return c;
    }
}