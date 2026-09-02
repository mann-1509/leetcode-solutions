import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        int n = p.length();

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (char ch : p.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Integer> answer = new ArrayList<>();

        int left = 0;
        int right = 0;

        while (right < s.length()) {
            char ch = s.charAt(right);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
            if (right - left + 1 > n) {

                char remove = s.charAt(left);

                map1.put(remove, map1.get(remove) - 1);

                if (map1.get(remove) == 0) {
                    map1.remove(remove);
                }

                left++;
            }
            if (right - left + 1 == n) {
                if (map1.equals(map)) {
                    answer.add(left);
                }
            }

            right++;
        }

        return answer;
    }
}