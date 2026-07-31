class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int res=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            int oldmax=max;
            int oldmin=min;
            max=Math.max(nums[i],Math.max(nums[i]*oldmax,nums[i]*oldmin));
            min=Math.min(nums[i],Math.min(nums[i]*oldmax,nums[i]*oldmin));

            res=Math.max(res,max);
        }
        return res;
    }
}
