class Solution {
    public boolean judgeCircle(String moves)
   {
        int sum=0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='U')
            {
               sum=sum+1;
            }
            else if(moves.charAt(i)=='D')
            {
                sum=sum-1;
            }
            else if(moves.charAt(i)=='L')
            {
                sum=sum+100;
            }
            else{
                sum=sum-100;
            }
        }
        return sum==0;
    }
}