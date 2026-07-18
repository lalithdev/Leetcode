class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length, reqSum=n*(n+1)/2, calSum=0;
        for(int num : nums){
            calSum+=num;
        }
        return reqSum-calSum;
    }
}