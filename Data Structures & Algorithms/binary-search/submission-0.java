class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length/2;
        if(target<nums[n]){
            for(int i=0;i<n;i++){
                if(nums[i]==target){
                    return i;
                }
            }
        }else if(target>nums[n]){
            for(int i=n;i<nums.length;i++){
                if(nums[i]==target){
                    return i;
                }
            }

        }else{
            return n;
        }
        return -1;
    }
}
