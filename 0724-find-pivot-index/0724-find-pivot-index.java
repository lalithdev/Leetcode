class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length, totalSum=0, currSum=0, leftSum=0, rightSum=0;
        for(int num : nums){
            totalSum+=num;
        }
        for(int i=0;i<n;i++){
            currSum+=nums[i];
            rightSum=totalSum-currSum;
            leftSum=totalSum-rightSum-nums[i];
            if(leftSum == rightSum) return i;
        }
        return -1;
    }
}