class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int ans = 0;

        for(int i=0;i<n;i++){
            char ch = word.charAt(i);

            if(ch >= 'A' && ch <= 'Z'){
                ans++;
            }
        }
        if(ans == n){
            return true;
        }
        if(ans == 0){
            return true;
        }
        if(ans == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z'){
            return true;
        }
        return false;
    }
}