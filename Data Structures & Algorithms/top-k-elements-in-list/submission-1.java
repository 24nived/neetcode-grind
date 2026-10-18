class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Bucket array
        List<Integer>[] arr = new ArrayList[nums.length + 1];

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Put keys into buckets based on frequency
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            int freq = m.getValue();

            if (arr[freq] == null) {
                arr[freq] = new ArrayList<>();
            }

            arr[freq].add(m.getKey());
        }

        int[] res = new int[k];
        int index = 0;

        // Traverse buckets from highest frequency
        for (int i = arr.length - 1; i >= 0 && index < k; i--) {

            if (arr[i] != null) {

                for (int num : arr[i]) {
                    res[index++] = num;

                    if (index == k)
                        break;
                }
            }
        }

        return res;
    }
}