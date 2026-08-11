class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            expected[i] = heights[i];
        }
        int count =0;
       for (int i = 0; i < heights.length - 1; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                
                if (heights[i] > heights[j]) {
                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;
                }
            }
            
        }
        for (int k = 0; k < heights.length; k++){
                if(heights[k] != expected[k]){
                count++;
                }
            }
        return count;
        
         
    }
}