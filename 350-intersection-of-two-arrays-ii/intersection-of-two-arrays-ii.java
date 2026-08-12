class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        
        for(int num:nums2){
            num2.add(num);
        }
        for(int i=0;i<nums1.length;i++){
           if(num2.contains(nums1[i])){
                answer.add(nums1[i]);
                num2.remove(Integer.valueOf(nums1[i]));
           }

            }
            
        
        
        int[] result = new int[answer.size()];
        for(int k=0;k<answer.size();k++){
            result[k]=answer.get(k);
        }
        return result; 
    }
}