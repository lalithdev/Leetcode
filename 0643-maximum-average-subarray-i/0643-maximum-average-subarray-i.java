class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double windowSum=0;
        for(int i=0;i<k;i++){
            windowSum+=nums[i];
        } 
        double maxAvg=windowSum/(double)k;
        for(int i=k;i<n;i++){
            windowSum+=nums[i]- nums[i-k];
            maxAvg=Math.max(windowSum/(double)k, maxAvg);
        }
        return maxAvg;
    }
}