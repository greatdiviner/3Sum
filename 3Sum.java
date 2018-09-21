class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int size = nums.length;
        if(size < 3) return new ArrayList<>();
        Arrays.sort(nums);

        Set<List<Integer>> resultSet = new HashSet<>();
        for(int i = 0; i < size - 2; i++) {
            if(nums[i] > 0) break;
            
            int begin = i+1;
            int end = size-1;
            
            do
            {
                while(begin < end - 1 && nums[i] + nums[begin] + nums[end] < 0) begin++;
                while(begin < end - 1 && nums[i] + nums[begin] + nums[end] > 0) end--;

                if(nums[i] + nums[begin] + nums[end] == 0) {
                    List<Integer> solution = new ArrayList<>(3);
                            solution.add(nums[i]);
                            solution.add(nums[begin]);
                            solution.add(nums[end]);
                            resultSet.add(solution);
                }
                
                begin++;
            } while(begin < end);
   
        }
        return new ArrayList<>(resultSet);
    }
}
