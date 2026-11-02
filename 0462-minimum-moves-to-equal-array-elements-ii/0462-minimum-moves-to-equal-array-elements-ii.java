class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums[(nums.length/2)];
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=n)
            {
                c=c+ Math.abs(n-nums[i]);
            }
        }
        return c;
    }
}