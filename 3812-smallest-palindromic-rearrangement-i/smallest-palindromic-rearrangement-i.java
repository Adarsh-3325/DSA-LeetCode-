class Solution {
    public String smallestPalindrome(String s) {
        int fre[] = new int[26];
        StringBuilder left = new StringBuilder();

        for(char ch : s.toCharArray()){
            fre[ch - 'a']++;
        }

        char middle = '\0';

        for(int i=0;i<26;i++){
            for(int j=0;j<fre[i]/2;j++){
                left.append((char)('a'+i));
            }
            if(fre[i] % 2 != 0){
                middle = (char)('a' + i);
            }
        }
        if(middle != '\0'){
            return left.toString() + middle + left.reverse().toString();
        }

        return left.toString() + left.reverse().toString();
    }
}