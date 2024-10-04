class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles; 
        
        while (numBottles >= numExchange) {
            int newBottles = numBottles / numExchange; 
            total += newBottles; 
            numBottles = newBottles + (numBottles % numExchange);  
        }
        return total;
    }
}
