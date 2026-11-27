class Solution {
    public int lengthOfLIS(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        for(int num :nums)
        {
            int l =0, r=list.size();
            while(l<r)
            {
                int mid =l+(r-l)/2;
                if(list.get(mid)<num)
                    l =mid+1;
                else
                    r =mid;
            }
            if(l==list.size())
                list.add(num);
            else
                list.set(l,num);
        }
        return list.size();
    }
}