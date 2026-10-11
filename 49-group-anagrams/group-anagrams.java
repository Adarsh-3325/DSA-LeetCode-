class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] arr = s.toCharArray();
        
        Arrays.sort(arr);

        String key = new String(arr);

        if(map.containsKey(key)){
            map.get(key).add(s);
        }
        else{
            List<String> list = new ArrayList<>();
            list.add(s);
            map.put(key, list);
        }
    }
        
        for(String s : map.keySet()){
            ans.add(map.get(s));
        }
        return ans;
    }
}