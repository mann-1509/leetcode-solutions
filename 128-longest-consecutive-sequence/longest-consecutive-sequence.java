class Solution {
    public int longestConsecutive(int[] nums) {
    Arrays.sort(nums);
    HashSet<Integer> set = new HashSet<>();
    int count=0;
    for(int num:nums){
        set.add(num);
    }
    int max=0;
    for(int num:set){
        count=1;
        int current =num;
        if(!set.contains(current-1)){
            count=1;
        while(set.contains(current+1)){
            current++;
            count++;

        }
        if(count>max){
            max=count;
        }
        }

    } 
    return max;

    }
}