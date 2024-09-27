class Solution {
    final String EQ = "equilateral";
    final String ISO = "isosceles";
    final String SCA = "scalene";
    final String NONC = "none";
    public String triangleType(int[] nums) {
        int a = nums[0], b = nums[1], c = nums[2];
        if (a + b <= c || b +c <= a || a + c <= b) return NONC;
        if (a == b && b == c) return EQ;
        if (a == b || b == c || a == c) return ISO;
        return SCA;
    }
}