class Solution {
    public int countBalls(int lowLimit, int highLimit)
    {
        int[] count=new int[46];
        int max=0;
        for(int i=lowLimit;i<=highLimit;i++){
            int n=i,sum=0;
            while(n>0){
                sum += n%10;
                n=n/10;
            }
            max=Math.max(max, ++count[sum]);
        }
        return max;
    }
}