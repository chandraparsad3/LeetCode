class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length == 0)
            return -1 ;
        else if(nums.length == 1)
            return 0 ;
        int l = nums[0];
        int index = 0 ;
        for(int i = 1 ; i<nums.length   ; i++ )
        {
            if(nums[i] > l )
            {
                l  = nums[i];
                index = i ;
            }
        }
        for(int i = 0 ; i<nums.length ; i++)
        {
            if(i == index)
                continue ;
            if(l < 2*nums[i])
                return -1 ;
        }
        return index ;
    }
}