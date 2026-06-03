class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length, needed=0;
        if(n==0)    return new int[]{-1, -1};
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            needed=target-nums[i];
            if(mp.containsKey(needed))
                return new int[]{i, mp.get(needed)};
            mp.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}