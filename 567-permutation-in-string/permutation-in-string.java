class Solution {
    public boolean checkInclusion(String s1, String s2) {
     HashMap<Character,Integer> need = new HashMap<>();
     HashMap<Character,Integer> window=new HashMap<>();
     for(char chr:s1.toCharArray()){
        need.put(chr,need.getOrDefault(chr,0)+1);
     }
     
     int left = 0;

for (int right = 0; right < s2.length(); right++) {
    char ch = s2.charAt(right);
    window.put(ch,window.getOrDefault(ch,0)+1);
    if (right - left + 1 > s1.length()) {
        char remove=s2.charAt(left);
        window.put(remove,window.get(remove)-1);
            left++;
    
    if(window.get(remove)==0){
        window.remove(remove);
    }
    }

   
    if (right - left + 1 == s1.length()&& need.equals(window)) {
        return true;
    

    }
}

return false;
    }
}