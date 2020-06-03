class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        findPermutation(result, list, nums);
        return result;
    }
    
    public void findPermutation(List<List<Integer>> result, List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            result.add(new ArrayList(list));
        }
        else {
            for (int i = 0; i <= nums.length-1; i++) {
                if (list.contains(nums[i])) {
                    continue;
                }
                list.add(nums[i]);
                findPermutation(result, list, nums);
                list.remove(list.size()-1);
            }
        }
    }
}