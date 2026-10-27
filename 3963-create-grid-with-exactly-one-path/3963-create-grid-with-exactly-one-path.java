class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid=new String[m];
        for(int i=0;i<m;i++)
        {
            String row="";
            for(int j=0;j<n;j++)
            {
                row+='#';
            }
            grid[i]=row;
        }
        String row="";
        for(int j=0;j<n;j++)
        {
            row+='.';
        }
        grid[0]=row;
        for(int i=0;i<m;i++)
        {
            grid[i]=grid[i].substring(0,n-1)+'.';
        }
        return grid;
    }
}