class Solution {
    public int commonFactors(int a, int b) 
    {
        int num=0;
        int count=0;
         num=(a>b)?b:a;
         for(int i=1;i<=num;i++)
         {
            if(a%i==0 && b%i==0)
            {
                count++;
            }
         }
         return count;
    }
}