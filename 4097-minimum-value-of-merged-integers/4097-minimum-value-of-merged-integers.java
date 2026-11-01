class Solution {
    public int minMergedInteger(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i+=2){
            String merged = String.valueOf(nums[i]) + String.valueOf(nums[i+1]);
            int mergedVal = Integer.parseInt(merged);
            min = Math.min(min, mergedVal);
        }
        return min;
    }
}