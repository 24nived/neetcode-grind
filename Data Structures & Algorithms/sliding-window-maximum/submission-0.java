class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // ArrayList<Integer> res = new ArrayList<>();

        // for(int i=0;i<=nums.length-k;i++){
        //     int max = nums[i];
        //     for(int j =i;j<i+k;j++){
        //         max = Math.max(max,nums[j]);
        //     }
        //     res.add(max);
        // }
        // return res.stream().mapToInt(Integer::intValue).toArray();

        //monotomic stack 
        int [] res = new int [nums.length-k + 1];
        Deque <Integer> win = new ArrayDeque<>();

        for(int i=0;i<nums.length;i++){
            if(!win.isEmpty() && win.peekFirst() < i-k+1){
                win.pollFirst();
            }

            while(!win.isEmpty() && nums[win.peekLast()] < nums[i]){
                win.pollLast();
            }

            win.offerLast(i);

            if(i >= k-1){
                res[i-k+1] = nums[win.peekFirst()];
            }
        }
        return res;

    }
}