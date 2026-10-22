class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int start=0;
        int out=0;

        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                if(start<=map.get(c)){
                    start=map.get(c)+1;
                }
            }
            out = Math.max(out,i-start+1);
            map.put(c,i);
        }
        return out;
        
    }
}