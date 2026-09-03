class Solution {
    public boolean uniformArray(int[] nums1) {
        int small=nums1[0];
        for(int i=1;i<nums1.length;i++)
        {
            if(nums1[i]<small)
            {
                small=nums1[i];
            }
        }
        if(small%2==1)
        {
            return true;
        }
        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]%2==1)
            {
                return false;
            }
        }
        return true;
    }
}