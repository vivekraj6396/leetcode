class Solution {
    public String getPermutation(int n, int k) {
    List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            list.add(i);
        }
        int fact=1;
        for(int i=1;i<n;i++)
        {
            fact=fact*i;
        }
        k--;
        String ans="";
        for(int i=n;i>=1;i--)
        {
            int index=k/fact;
            ans+=list.get(index);
            list.remove(index);
            if(i>1)
            {
                k=k%fact;
                fact=fact/(i-1);
            }
        }
    return ans;
    }
}