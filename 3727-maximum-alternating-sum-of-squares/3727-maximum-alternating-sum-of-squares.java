import java.util.Arrays;
class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        //help
        Integer arr[]=new Integer[n];
        for(int i=0;i<n;i++) {
            arr[i]=nums[i];
        }
        Arrays.sort(arr,(a,b)->Long.compare(Math.abs((long)a),Math.abs((long)b)));
        //...
        long sum=0;
        for(int i=0;i<n;i++) {
            long sqr=(long)arr[i]*arr[i];
            if(i<n/2) {
                sum-=sqr;
            }
            else {
                sum+=sqr;
            }
        }
        return sum;
    }
}