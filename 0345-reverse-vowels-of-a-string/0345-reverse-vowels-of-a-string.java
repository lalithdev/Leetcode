class Solution {
    public String reverseVowels(String s) {
        int n=s.length(), low=0, high=n-1;
        HashSet<Character> set=new HashSet<>();
        String vowels="aeiouAEIOU";
        char[] arr=s.toCharArray();
        while(low<high){
            while(low < high && vowels.indexOf(arr[low]) == -1){
                low++;
            }
            while(low < high && vowels.indexOf(arr[high]) == -1){
                high--;
            }
            if(low<high){
                char temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
        return new String(arr);
    }
}