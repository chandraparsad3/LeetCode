class Solution {
    public int countNegatives(int[][] grid)
    {
        int count=0;
        for(int i=grid.length-1;i>=0;i--)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]<0)
                {
                    count=count+grid[i].length-j;
                    break;
                }
            }
        }
        return count;
    }
}