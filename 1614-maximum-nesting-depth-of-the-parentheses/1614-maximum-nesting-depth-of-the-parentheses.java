class Solution {
    public int maxDepth(String s) {
        int c1=0;
        int c2=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                c1++;
                c2=Math.max(c2,c1);
            }
            else if(s.charAt(i)==')')
            {
                c1--;
            }
        }
        return c2;
    }
}