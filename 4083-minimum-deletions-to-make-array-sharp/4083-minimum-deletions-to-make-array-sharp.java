class Solution {
    public int minDeletions(int[] nums) {
        int duplicates = 0;
        int prev = -1;         
        for (int num : nums) {
            if (num == prev) {
                duplicates++;
            } else {
                prev = num;
            }
        }
        return duplicates;
    }
}