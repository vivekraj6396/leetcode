class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        if(rev.equals(s))
        {
            return true;
        }
        return false;
    }
}