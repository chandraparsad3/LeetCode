class Solution {
    public boolean isPowerOfThree(int n) 
    { 
        if (n == 1) return true;
        while(0 < n){
            if (n % 3 != 0){
                return false;
            }
            n = n/3;
            if (n == 1){
                return true;
            }
        }
        return false;
    }
}