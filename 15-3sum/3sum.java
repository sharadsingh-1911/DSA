class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> ans = new HashSet<>();

        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            HashSet<Integer> set = new HashSet<>();

            for (int j = i + 1; j < n; j++) {

                int third = -(nums[i] + nums[j]);

                if (set.contains(third)) {
                    ans.add(Arrays.asList(nums[i], third, nums[j]));
                }

                set.add(nums[j]);
            }
        }

        return new ArrayList<>(ans);
    }
}