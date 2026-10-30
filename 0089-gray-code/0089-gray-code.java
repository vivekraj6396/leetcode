class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<(1<<n);i++)
        {
            int num=i^(i>>1);
            ans.add(num);
        }
        return ans;
    }
}