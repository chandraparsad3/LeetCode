class Solution {
    public boolean checkPerfectNumber(int num) {
     int sum=0;
     for(int i=0;i<num/2;i++)
     {
        if(num%(i+1)==0)
        {
            sum=sum+i+1;
        }
     }
     return sum==num;
        
    }
}