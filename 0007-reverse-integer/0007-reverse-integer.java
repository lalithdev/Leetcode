class Solution {
    public int reverse(int x) {
        int f=0;
        if(x<0){
            f=1;
            x= x - (2*x);
        }
        int r=0, rev=0;
        while(x>0){
            r=x%10;
            x=x/10;
            if(rev>Integer.MAX_VALUE/10 || rev==Integer.MAX_VALUE/10 && r>7)
                return 0;
            if(rev<Integer.MIN_VALUE/10 || rev==Integer.MIN_VALUE/10 && r<-8)
                return 0;
            rev=rev*10+r;
        }
        if(f==1)
            rev= rev-(2*rev);
        return rev;
    }
}