class Solution {
    public boolean isPalindrome(String s) {
        String a = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            if(ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9'){
                sb.append(ch);
            }
        }
        String ans = sb.toString();
        int n = ans.length()-1;

        for(int i=0;i<ans.length();i++){
            if(ans.charAt(i) != ans.charAt(n-i)){
                return false;
            }
        }
        return true;
    }
}