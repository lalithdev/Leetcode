class Solution {
    public int majorityElement(int[] nums) {
        int current=0, n=nums.length, cnt=0;
        for(int i=0;i<n;i++){
            current=nums[i];
            cnt=1;
            for(int j=1;j<n;j++){
                if(nums[j] == current)
                    cnt++;
            }
            if(cnt > n/2) return current;
        }
        return 0;
    }
}