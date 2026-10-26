class Solution {
    public int calculateScore(int a, int b) {
        int res = 0, s1 = 0, s2 = 0;
        while(a > 0){
            if( (a & 1) == 1 ) 
                s1++;
            a = a >> 1;
        }
        while(b > 0){
            if( (b & 1) == 1 )
                s2++;
            b = b >> 1;
        }
        if(s1 >= s2) res = s1 * s2;
        else res = s2/s1;
        return (res);
        
    }
}