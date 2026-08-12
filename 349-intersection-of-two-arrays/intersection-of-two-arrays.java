class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        
        for(int num:nums2){
            num2.add(num);
        }
        for(int j=0;j<nums1.length;j++){
            if (num2.contains(nums1[j])&& !answer.contains(nums1[j])){
                answer.add(nums1[j]);
            }
        }
        int[] result = new int[answer.size()];
        for(int k=0;k<answer.size();k++){
            result[k]=answer.get(k);
        }
        return result;
       
    }
}