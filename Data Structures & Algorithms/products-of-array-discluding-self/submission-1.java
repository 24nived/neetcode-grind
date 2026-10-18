class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] arr = new int [n];

        // for(int i=0;i<nums.length;i++){
        //     int c =1;
        //     for(int j=0;j<nums.length;j++){
        //         if(i==j)continue;
                
        //         c=c*nums[j];
                
        //     }
        //     arr[i]=c;
        // }

        // return arr;
       // int i=0;
        
    //     for(int i=0;i<nums.length;i++){
    //         int prefix=1;
    //         int sufix =1;
    //         int left=0;
    //         int right = nums.length-1;
            
    //         while (left<i){
    //         prefix = prefix*nums[left];
    //         left++;
    //         }
    //         while(i<right){
    //             sufix= sufix*nums[right];
    //             right--;
    //         }

    //         arr[i]=prefix*sufix;

    //     }
    //     return arr;
    // }

        int prefix = 1;

        // Store left product
        for(int i = 0; i < n; i++) {
            arr[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;

        // Multiply right product
        for(int i = n - 1; i >= 0; i--) {
            arr[i] *= suffix;
            suffix *= nums[i];
        }

        return arr;
    }
}
        
 
