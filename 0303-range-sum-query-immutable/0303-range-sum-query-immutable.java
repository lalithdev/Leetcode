class NumArray {
    public static int[] prefixSum;
    public NumArray(int[] nums) {
        int n=nums.length;
        prefixSum=new int[n];
        prefixSum[0]=nums[0];
        for(int i=1;i<n;i++){
            prefixSum[i]=prefixSum[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        int ans=0;
        if(left==0) ans=prefixSum[right];
        else ans=prefixSum[right]-prefixSum[left-1];
        return ans;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */