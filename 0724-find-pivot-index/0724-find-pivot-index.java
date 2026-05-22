class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length, totalSum=0, leftSum=0, rightSum=0;
        for(int num : nums)
            totalSum+=num;
        for(int i=0;i<n;i++){
            rightSum=totalSum-leftSum-nums[i];
            if(rightSum==leftSum)   return i;
            leftSum+=nums[i];
        }
        return -1;
    }
}