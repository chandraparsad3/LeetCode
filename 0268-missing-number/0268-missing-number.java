class Solution {
    public int missingNumber(int[] nums)
    {
      int i=0;
      while(i<nums.length)
      {
          int correct=nums[i];
          if(correct<nums.length && nums[correct]!=nums[i])
          {
              int temp=nums[correct];
              nums[correct]=nums[i];
              nums[i]=temp;
          }
          else
          {
              i++;
          }
      }
      for(int j=0;j<nums.length;j++)
      {
          if(j!=nums[j])
          {
              return j;
          }
      }
      return nums.length;
    }
}