class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int len = arr.length;
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);

        for(int i = 0; i < len - 2; i++){
            if(i > 0 && arr[i] == arr[i - 1]) continue;

            int j = i + 1;
            int k = len - 1;

            while (j < k){
                int sum = arr[i] + arr[j] + arr[k];

                if(sum == 0){
                    ans.add(List.of(arr[i], arr[j], arr[k]));
                    j++;
                    k--;

                    while(j < k && arr[j] == arr[j - 1]){
                        j++;
                    }

                    while(j < k && arr[k] == arr[k + 1]){
                        k--;
                    }
                } else if (sum > 0){
                    k--;
                } else {
                    j++;
                }
            }
        }
        return ans;
    }
}