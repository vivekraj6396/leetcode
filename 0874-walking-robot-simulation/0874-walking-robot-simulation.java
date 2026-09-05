class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<obstacles.length;i++)
        {
            set.add(obstacles[i][0]+","+obstacles[i][1]);
        }
        int x=0;
        int y=0;
        int dir=0;
        int max=0;
        int dx[]={0,1,0,-1};
        int dy[]={1,0,-1,0};
        for(int i=0;i<commands.length;i++)
        {
            if(commands[i]==-1)
            {
                dir=(dir+1)%4;
            }
            else if(commands[i]==-2)
            {
                dir=(dir+3)%4;
            }
            else
            {
                for(int j=0;j<commands[i];j++)
                {
                    int nx=x+dx[dir];
                    int ny=y+dy[dir];
                    if(set.contains(nx+","+ny))
                    {
                        break;
                    }
                    x=nx;
                    y=ny;
                    max=Math.max(max,x*x+y*y);
                }
            }
        }
        return max;
    }
}