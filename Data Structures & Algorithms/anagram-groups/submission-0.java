class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        boolean [] v = new boolean[strs.length];
         for(int i=0;i<strs.length;i++){
            if(v[i])continue;
            List<String> inner = new ArrayList<>();
            String s = strs[i];
            v[i]=true;
            inner.add(s);
            for(int j=i+1;j<strs.length;j++){ 
                String c = strs[j];
               // if(inner.contains(c))continue;
                if(s.length()==c.length()){
                    if(!v[j]&& ana(s,c)){
                        inner.add(c);
                        v[j]=true;
                     //   continue;
                    }  
                }
            }
            if(!inner.isEmpty())res.add(inner);
            inner = new ArrayList<>();
         }
        
         return res;
    }
    public boolean ana(String a,String b){

        int [] arr = new int [26];
        for(char k=0;k<a.length();k++){
            arr[a.charAt(k)-'a']++;
            arr[b.charAt(k)-'a']--;
        }
            for(int c:arr){
                if(c!=0)return false;
            }
            return true;
        }
}
