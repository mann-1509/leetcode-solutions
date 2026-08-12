import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            list1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            list2.add(nums2[i]);
        }

        ArrayList<List<Integer>> answer = new ArrayList<>();

        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (!list2.contains(nums1[i]) && !first.contains(nums1[i])) {
                first.add(nums1[i]);
            }
        }

        for (int j = 0; j < nums2.length; j++) {
            if (!list1.contains(nums2[j]) && !second.contains(nums2[j])) {
                second.add(nums2[j]);
            }
        }

        answer.add(first);
        answer.add(second);

        return answer;
    }
}  