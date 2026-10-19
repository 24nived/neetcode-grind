class Solution {
    public boolean isPalindrome(String s) {

        //char[] arr = s.toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray();

        int left=0;
        int right=s.length()-1;

        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
                    if(Character.toLowerCase(s.charAt(left))!=
                    Character.toLowerCase(s.charAt(right))){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}
