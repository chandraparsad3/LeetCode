class Solution {
    public List<Integer> luckyNumbers (int[][] matrix)
    {
        ArrayList<Integer> list=new ArrayList<>();
         for(int i=0;i<matrix.length;i++)
         {
             int min=Integer.MAX_VALUE;
             int rowIndex=-1;
             int columnIndex=-1;
             for(int j=0;j<matrix[i].length;j++)
             {
                 if(min>matrix[i][j])
                 {
                     min=matrix[i][j];
                     rowIndex=i;
                     columnIndex=j;
                 }
             }
             if(check(min,rowIndex,columnIndex,matrix))
             {

                 list.add(min);
             }
         }
         return list;

    }
    boolean check(int min,int rowIndex,int columnIndex,int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            if(min<matrix[i][columnIndex])
            {
                return false;
            }

        }
        return true;
    }
}