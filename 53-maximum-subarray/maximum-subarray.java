class Solution {
    public int maxSubArray(int[] nums) {

        int msum = nums[0];
        int csum =0;
        for (int num: nums){
            csum+=num;
            if(csum>msum){
                msum=csum;
                
            }
            if(csum<0){
                csum=0;
            }
            
        }
        return msum;
         
        
    }
}