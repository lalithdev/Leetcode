class Solution {
    public int peakValleyDifference(int[] nums) {
        int n = nums.length, sum = 0, valleys = 0, peaks = 0;
        for(int i=1;i<n-1;i++){
            if( (nums[i] > nums[i-1]) && (nums[i] > nums[i+1]) ){
                peaks += nums[i];
            }
            else if((nums[i] < nums[i-1]) && (nums[i] < nums[i+1])){
                valleys += nums[i];
            }
        }
        return peaks - valleys;
    }
}