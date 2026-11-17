class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] res = new int [temperatures.length];
        int n = temperatures.length;

        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i+1;j<n;j++){
        //         if(temperatures[j]>temperatures[i]){
        //             sum = j-i;
        //             res[i]=sum;
        //             break;
        //         }
        //     }
        // }
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<n;i++){
            while(!s.isEmpty() && temperatures[i] > temperatures[s.peek()]){
                int index = s.pop();

                res[index] = i-index;
            }
            s.push(i);

        }

        return res;
    }
}
