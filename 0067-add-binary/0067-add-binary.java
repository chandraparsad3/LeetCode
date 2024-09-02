import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) 
    {
      BigInteger an=new BigInteger(a,2);
      BigInteger bn=new BigInteger(b,2);
      BigInteger ans=an.add(bn);//Add two binay number

      return ans.toString(2);//return string in binary format
    }
}