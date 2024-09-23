class Solution {
    public int alternateDigitSum(int n) 
    {
        int sum=0;
        while(n>0)
        {
            sum=sum*(-1)+n%10;
            n/=10;
        }
        return sum;
    }
}