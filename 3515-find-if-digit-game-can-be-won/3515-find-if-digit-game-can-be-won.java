class Solution {
    public boolean canAliceWin(int[] nums) 
    {
     int alsum=0;
     int bobsum=0;
     for(int i=0;i<nums.length;i++)
     {
        if(nums[i]>9)
        {
            alsum=alsum+nums[i];
        }
        else
        {
            bobsum=bobsum+nums[i];
        }
     }   
     return bobsum!=alsum;
    }
}