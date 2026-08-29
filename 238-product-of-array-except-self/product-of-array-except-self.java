class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] sum1 = new int[nums.length];
        int[] sum2 = new int[nums.length];
        int[] ans = new int[nums.length];
        int prefix=1;
        int suffix=1;
       for(int i=0;i<nums.length;i++){
        sum1[i]=prefix;
        prefix*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
        sum2[i]=suffix;
        suffix*=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            ans[j]=sum1[j]*sum2[j];
        }
        return ans;

    }
}