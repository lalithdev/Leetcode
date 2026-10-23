class Solution {
    public int romanToInt(String s) {
        int res = 0, prev = 0, ans = 0;
        for(int i=s.length() - 1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch == 'I') res = 1;
            else if(ch == 'V')  res = 5; 
            else if(ch == 'X')  res = 10; 
            else if(ch == 'L')  res = 50; 
            else if(ch == 'C')  res = 100; 
            else if(ch == 'D')  res = 500;
            else if(ch == 'M')  res = 1000; 

            if(res < prev){
                ans -= res;
            }
            else{
                ans += res;
            }
            prev = res;
        }
        return ans;
    }
}