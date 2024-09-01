class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int i=0;
        if(x<0){
            return false;
        }
        else{
            while(x>0){
                i=i*10+x%10;
                x/=10;
            }
        }
        return i==temp;
    }
}