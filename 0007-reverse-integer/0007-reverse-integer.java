class Solution {
    public int reverse(int x) 
    {
        int sum=0;
        int temp=x;
        if(x<0)
        {
            x=x*-1;
        }
        while(x>0)
        {
            if(sum>(Integer.MAX_VALUE-x%10)/10)
            {
                return 0;
            }
            sum=sum*10+x%10;
            
            x/=10;
        }
        if(temp<0)
        {
            sum=sum*-1;
        }
        return (int)sum;
    }
}