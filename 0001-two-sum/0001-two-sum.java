class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length, sum=0;
        if(n==0)    return new int[]{-1, -1};
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                sum=nums[i]+nums[j];
                if(sum == target)   return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }
}