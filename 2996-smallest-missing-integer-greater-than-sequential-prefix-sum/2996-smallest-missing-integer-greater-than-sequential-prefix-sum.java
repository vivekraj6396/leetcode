class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i] == nums[i-1]+1)
            {
                sum = sum+nums[i];
            }
            else
            {
                break;
            }
        }
        int ans = sum;
        while(true)
        {
            boolean found = false;
            for(int i=0; i<nums.length; i++)
            {
                if(nums[i] == ans)
                {
                    found = true;
                    break;
                }
            }
            if(found == false)
            {
                return ans;
            }
            ans++;
        }
    }
}