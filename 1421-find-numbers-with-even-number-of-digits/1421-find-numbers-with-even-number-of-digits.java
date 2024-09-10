class Solution {
    public int findNumbers(int[] nums) 
    {
        int count=0;
       for(int i=0;i<nums.length;i++)
       {
         int amt=0;
         while(nums[i]>0)
         {
           nums[i]=nums[i]/10;
           amt++;
         }
         if(amt%2==0)
         {
               count++;
         }
       }    
       return count;
    }
}