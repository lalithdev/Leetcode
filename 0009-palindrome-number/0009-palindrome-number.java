class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int r=0,rev=0;
        while(x>0){
            r=x%10;
            rev=rev*10+r;
            x=x/10;
        }
        return n==rev;
    }
}