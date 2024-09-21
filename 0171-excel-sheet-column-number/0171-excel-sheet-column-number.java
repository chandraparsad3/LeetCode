class Solution {
    public int titleToNumber(String columnTitle) 
    {
      int row=0;
      for(int i=0; i<columnTitle.length();i++)
      { 
          //From A to Z 1 to 26 
          //From AA its 27 because first A represnt 26 and second A 1
          row=row*26+(columnTitle.charAt(i)-'A')+1;
      }   
      return row;
    }
}