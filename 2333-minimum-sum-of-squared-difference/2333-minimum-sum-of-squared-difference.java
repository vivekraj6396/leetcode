class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n=nums1.length;
        int k=k1+k2;
        int diff[]=new int[n];
        int max=0;
        for(int i=0;i<n;i++) 
        {
            diff[i]=Math.abs(nums1[i]-nums2[i]);
            max=Math.max(max,diff[i]);
        }
        int freq[]=new int[max+1];
        for(int i=0;i<n;i++) 
        {
            freq[diff[i]]++;
        }
        for(int i=max;i>0 && k>0;i--) {
            int t=Math.min(freq[i],k);
            freq[i]-=t;
            freq[i-1]+=t;
            k=k-t;
        }
        long ans=0;
        for(int i=0;i<freq.length;i++) 
        {
            ans=ans+(long)i*i*freq[i];
        }
        return ans;
    }
}