class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

       
        for (int i = 0; i < n / 2; i++) {
            int temp1 = nums[i];
            nums[i] = nums[n - 1 - i];
            nums[n - 1 - i] = temp1;
        }

       
        for (int j = 0; j < k / 2; j++) {
            int temp2 = nums[j];
            nums[j] = nums[k - 1 - j];
            nums[k - 1 - j] = temp2;
        }

        for (int a = k; a < k + (n - k) / 2; a++) {
            int temp3 = nums[a];
            nums[a] = nums[n - 1 - (a - k)];
            nums[n - 1 - (a - k)] = temp3;
        }
    }
}