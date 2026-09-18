class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int first[]=new int[26];
        int last[]=new int[26];
        for(int i=0;i<26;i++)
        {
            first[i]=-1;
            last[i]=-1;
        }
        for(int i=0;i<s.length();i++)
        {
            int x=s.charAt(i)-'a';
            if(first[x]==-1)
            {
                first[x]=i;
            }
            last[x]=i;
        }
        List<int[]> list=new ArrayList<>();
        for(int i=0;i<26;i++)
        {
            if(first[i]==-1)
            {
                continue;
            }
            int start=first[i];
            int end=last[i];
            boolean flag=true;
            for(int j=start;j<=end;j++)
            {
                int x=s.charAt(j)-'a';
                if(first[x]<start)
                {
                    flag=false;
                    break;
                }

                end=Math.max(end,last[x]);
            }
            if(flag)
            {
                list.add(new int[]{start,end});
            }
        }
        list.sort((a,b)->a[1]-b[1]);
        List<String> ans=new ArrayList<>();
        int end=-1;
        for(int i=0;i<list.size();i++)
        {
            int start=list.get(i)[0];
            int right=list.get(i)[1];
            if(start>end)
            {
                ans.add(s.substring(start,right+1));
                end=right;
            }
        }
        return ans;
    }
}