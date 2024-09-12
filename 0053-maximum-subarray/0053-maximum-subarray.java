class Solution {
    public int maxSubArray(int[] nums) 
    {
        int sum=0;//declared variable sum with value 0
         int max=Integer.MIN_VALUE; // declared max variable with min integer value
         for(int i=0;i<nums.length;i++)
         {
             sum=sum+nums[i]; // keep adding to sum
             max=Math.max(sum,max); // compare between sum and max and keep the value safe in max variable to compare in next round
             if(sum<0)
             {
                 sum=0;
             }
         }
         return max;
    }
}