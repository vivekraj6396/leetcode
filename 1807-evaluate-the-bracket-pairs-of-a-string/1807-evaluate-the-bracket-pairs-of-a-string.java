class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<knowledge.size();i++) 
        {
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        String ans="";
        for(int i=0;i<s.length();i++) 
        {
            if(s.charAt(i)=='(') 
            {
                int j=i+1;
                String key="";
                while(s.charAt(j)!=')') 
                {
                    key=key+s.charAt(j);
                    j++;
                }
                if(map.containsKey(key)) 
                {
                    ans=ans+map.get(key);
                }
                else 
                {
                    ans=ans+"?";
                }
                i=j;
            }
            else 
            {
                ans=ans+s.charAt(i);
            }
        }
        return ans;
    }
}