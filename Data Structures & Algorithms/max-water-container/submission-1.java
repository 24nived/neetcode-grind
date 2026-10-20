class Solution {
    public int maxArea(int[] heights) {
        int maxarea=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=heights.length-1;
        while(left<right){
            max= (right-left)*Math.min(heights[left],heights[right]);
            maxarea = Math.max(max,maxarea);
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }

        }
        return maxarea;
        
    }
}
