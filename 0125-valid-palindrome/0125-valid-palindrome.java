class Solution {
    public boolean isPalindrome(String s) {
        String p=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        StringBuilder t=new StringBuilder();
        for(int i=p.length()-1;i>=0;i--){
            t.append(p.charAt(i));
        }
        if(p.equals(t.toString()))
            return true;
        return false;
    }
}