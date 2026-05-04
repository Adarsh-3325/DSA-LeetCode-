class Solution {
    public int romanToInt(String s) {
        int curr = 0;
        int prev = 0;

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'I'){
                map.put(ch,1);
            }
            if(ch == 'V'){
                map.put(ch,5);
            }
            if(ch == 'X'){
                map.put(ch,10);
            }
            if(ch == 'L'){
                map.put(ch,50);
            }
            if(ch == 'C'){
                map.put(ch,100);
            }
            if(ch == 'D'){
                map.put(ch,500);
            }
            if(ch == 'M'){
                map.put(ch,1000);
            }

        }
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            int val = map.get(ch);
            
            if(val < prev){
                curr -= val; 
            }
            else{
                curr += val;
            }
            prev = val;
        }
        return curr;
    }
}