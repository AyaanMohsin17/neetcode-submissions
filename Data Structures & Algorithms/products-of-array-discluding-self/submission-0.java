class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int pre=1,post=1;
        int[] result=new int[n];
        Arrays.fill(result,1);
        for(int i=0;i<n;i++){
            result[i]=pre;
            pre=pre*nums[i];
        }
        for(int i=n-1;i>=0;i--){
            result[i]=result[i]*post;
            post=post*nums[i];
        }
         return result;
    }
}  
