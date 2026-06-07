class Solution {
    public int majorityElement(int[] nums) {
        int current=0, n=nums.length, cnt=0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt=1;
                current=nums[i];
            }
            else if(current == nums[i]) cnt++;
            else if(current != nums[i]) cnt--;
        }
        int cnt1=0;
        for(int j=0;j<n;j++){
            if(nums[j] == current)  cnt1++;
        }
        if(cnt1 > n/2) return current;
        return 0;
    }
}