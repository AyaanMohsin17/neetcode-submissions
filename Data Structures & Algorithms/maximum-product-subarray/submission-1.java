class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int res=nums[0];       
        int n=nums.length;
        for(int i=1;i<n;i++){
            int oldmax=max;
            int oldmin=min;

            max=Math.max(nums[i],Math.max(oldmax*nums[i],oldmin*nums[i]));
            min=Math.min(nums[i],Math.min(oldmin*nums[i],oldmax*nums[i]));

            res=Math.max(res,max);
        }
        
        return res;
    }
}
