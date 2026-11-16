class Solution {
    public String minWindow(String s, String t) {

        if(t.isEmpty())return "";

        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> win = new HashMap<>();

        for(char c: t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int have =0;
        int need = map.size();
        int [] res = {-1, -1};
        int reslen = Integer.MAX_VALUE;
        int l = 0;

        for(int r=0;r<s.length();r++){
            char c = s.charAt(r);
            win.put(c,win.getOrDefault(c,0)+1);

            if(map.containsKey(c) && win.get(c).equals(map.get(c))){
                have++;
            }

            while (have == need){
                if((r-l+1)< reslen){
                    reslen = r-l+1;
                    res[0]=l;
                    res[1]=r;
                }
                char lc = s.charAt(l);

                win.put(lc,win.get(lc)-1);

                if(map.containsKey(lc) && win.get(lc) < map.get(lc)){
                    have--;
                }
                l++;
            }
        }
        return reslen == Integer.MAX_VALUE ? "" : s.substring(res[0],res[1]+1);
        
    }
}
