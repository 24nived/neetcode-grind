class Solution {
    public int trap(int[] height) {
         int n = height.length;
        // int [] premax = new int [n];
        // int [] sufmax = new int [n];

        // int total=0;

        // premax[0]=height[0];
        // sufmax[n-1]=height[n-1];

        // for(int i=1;i<n;i++){
        //     premax[i]=Math.max(premax[i-1],height[i]);
        // }

        // for(int j=n-2;j>=0;j--){
        //     sufmax[j] = Math.max(sufmax[j+1],height[j]);
        // }

        // for(int i=0;i<n;i++){
        //    // if(height[i]>premax[i] && height[i]>sufmax[i]){
        //         total += Math.min(premax[i],sufmax[i])-height[i];
        //    // }

        // }
        // return total;

        int leftmax=0;
        int rightmax=0;
        int total=0;

        int left = 0;
        int right = n-1;

        while(left<right){
            if(height[left] <= height[right]){
                if(leftmax > height [left]){
                    total+=leftmax-height[left];
                }else{
                    leftmax=height[left];
                }
                left++;
            }else{
                if(rightmax > height[right]){
                    total +=rightmax-height[right];
                }else{
                    rightmax=height[right];
                }
                right--;
            }

        }
        return total;
        
    }
}