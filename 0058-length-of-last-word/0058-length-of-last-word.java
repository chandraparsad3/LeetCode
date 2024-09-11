class Solution {
    public int lengthOfLastWord(String s) {
     s.strip();
     String[] arr=s.split(" ");
     return arr[arr.length-1].length(); 
    }
}