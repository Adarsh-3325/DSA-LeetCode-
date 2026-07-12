class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] rank = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            rank[i] = arr[i];
        }

        Arrays.sort(arr);
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank1 = 1;

        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], rank1++);
            }
        }

        int ans[] = new int[arr.length];
        for(int i=0;i<rank.length;i++){
            ans[i] = map.get(rank[i]);
            
        }
        return ans;
    }
}