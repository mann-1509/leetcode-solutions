import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     HashMap<String, List<String>> map = new HashMap<>();
     ArrayList<String> sorted = new ArrayList<>();  
    for(int i=0;i<strs.length;i++){
    char[] chars = strs[i].toCharArray();
    Arrays.sort(chars);
    String key = new String(chars);
    map.put(key, map.getOrDefault(key, new ArrayList<>()));
   map.get(key).add(strs[i]);
    }
    return new ArrayList<>(map.values());
    }
}