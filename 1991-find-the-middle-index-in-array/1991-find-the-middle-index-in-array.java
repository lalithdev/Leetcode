class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length, totalsum=0, leftsum=0, rightsum=0;
        for(int num : nums)    totalsum+=num;
        for(int i=0;i<n;i++){
            rightsum=totalsum-leftsum-nums[i];
            if(rightsum == leftsum) return i;
            leftsum+=nums[i];
        }
        return -1;
    }
}