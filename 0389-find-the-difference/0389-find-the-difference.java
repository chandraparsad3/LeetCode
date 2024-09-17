class Solution {
    public char findTheDifference(String s, String t) 
    {
        int xor=0;
        for(int i=0;i<s.length();i++)
        {
            xor^=s.charAt(i);
        }
        for(int j=0;j<t.length();j++)
        {
            xor^=t.charAt(j);
        }
        return (char)xor;
    }
}