class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();

        for(int i=1;i<=9;i++){
            int ans = i;
            for(int start=i+1;start<=9;start++){
                ans = ans * 10 + start;

                if(ans >= low && ans <= high){
                    list.add(ans);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}