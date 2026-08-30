class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minIndex=0;
        int maxIndex=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
                minIndex=i;
            }
            if(nums[i]>max)
            {
                max=nums[i];
                maxIndex=i;
            }
        }
        int left=Math.max(minIndex,maxIndex)+1;
        int right=nums.length-Math.min(minIndex,maxIndex);
        int both=Math.min(minIndex,maxIndex)+1+
                 nums.length-Math.max(minIndex,maxIndex);
        return Math.min(left,Math.min(right,both));
    }
}