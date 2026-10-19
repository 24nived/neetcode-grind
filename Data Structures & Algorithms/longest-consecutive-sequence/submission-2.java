class Solution {
    public int longestConsecutive(int[] nums) {
        // Arrays.sort(nums);

        // int count = 1;
        // int longest=1;

        // if(nums.length==0)return 0;
       
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==nums[i-1])continue;

        //     if(nums[i]==nums[i-1]+1){
        //         count++;
        //     }
        //     else{
        //         count=1;
        //     }

        //     longest = Math.max(longest,count);
        
        HashSet <Integer> set = new HashSet<>();

        for(int num:nums){
            set.add(num);
        }

        int longest = 0;

        for(int n:set){
            if(!set.contains(n-1)){
                int current = n;
                int count = 1;

                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}
