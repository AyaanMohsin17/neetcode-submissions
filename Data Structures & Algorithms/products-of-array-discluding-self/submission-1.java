class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int result[]=new int[n];
        int pre=1,post=1;
        Arrays.fill(result,1);
        for(int i=0;i<n;i++){
            result[i]=pre;
            pre=pre*nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            result[i]=result[i]*post;
            post=nums[i]*post;
        }
        return result;
    }
}  
