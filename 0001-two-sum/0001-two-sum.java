class Solution {
    public int[] twoSum(int[] nums, int target) {
        int counter = 0;
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            result[0] = i;
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
}