class Solution {
    //https://leetcode.com/problems/valid-anagram/description/
    //https://www.techinterviewhandbook.org/best-practice-questions/
    public boolean isAnagram(String s, String t) {
        //String left="", right="";
        if(s.length() != t.length()){
           return false;
        }
        //boolean flag=true;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0 ; i < s.length(); i ++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        //Map<Character,Integer> map1 = new HashMap<>();
        for(int i=0 ; i < t.length(); i ++){
           map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
        }

        for(int val: map.values()){
            if(val<0){
                return false;
            }
        }

        return true;
    }
}
