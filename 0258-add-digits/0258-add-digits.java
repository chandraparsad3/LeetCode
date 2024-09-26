class Solution {
    public int addDigits(int num) 
    {
        int sum=0;
         if(num<10)
         {
            return num;
         }
         else{
            while(num>0)
            {
                sum=sum+num%10;
                num=num/10;
            }
         }
         return addDigits(sum);
    }
}