class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) 
    {
        int alice=0;
        int bob=0;
        for(int i=0;i<aliceSizes.length;i++)
        {
            alice=alice+aliceSizes[i];
        }
        for(int j=0;j<bobSizes.length;j++)
        {
            bob=bob+bobSizes[j];
        }
        int target=(alice-bob)/2;
             for (int aliceCandy : aliceSizes) {
            for (int bobCandy : bobSizes) {
                if (aliceCandy - bobCandy == target) {
                    return new int[] { aliceCandy, bobCandy };
                }
            }
        }
        
        
        return new int[0];
    }
}