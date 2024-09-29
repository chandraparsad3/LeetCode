class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
        if(low%2!=0 || high%2!=0){
            count++;
        }
        return (high-low)/2 + count;
    }
}