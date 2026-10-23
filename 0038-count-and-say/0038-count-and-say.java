class Solution {
    public String countAndSay(int n) {
        String s="1";
        for(int k=1;k<n;k++)
        {
            String ans="";
            for(int i=0;i<s.length();)
            {
                int count=0;
                char c=s.charAt(i);
                while(i<s.length() && s.charAt(i)==c)
                {
                    count++;
                    i++;
                }
                ans+=count;
                ans+=c;
            }
            s=ans;
        }
        return s;
    }
}