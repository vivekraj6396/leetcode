class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int min=Integer.MAX_VALUE;
        int ans=Integer.MAX_VALUE;
        map.put(0,-1);
        int best[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            if(map.containsKey(sum-target))
            {
                int start=map.get(sum-target);
                int len=i-start;
                if(start>=0 && best[start]!=0)
                {
                    ans=Math.min(ans,len+best[start]);
                }
                if(len<min)
                {
                    min=len;
                }
            }
            if(min!=Integer.MAX_VALUE)
            {
                best[i]=min;
            }
            map.put(sum,i);
        }
        if(ans==Integer.MAX_VALUE)
        {
            return -1;
        }
        return ans;
    }
}