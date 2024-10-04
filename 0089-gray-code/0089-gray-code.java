class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);

        for(int i = 1; i <= n; i++){
            List<Integer> rev = new ArrayList<>(list);
            Collections.reverse(rev);
            int val = (int)Math.pow(2,i-1);
            for(int v : rev) list.add(v+val);
        }
        
        return list;
    }
}