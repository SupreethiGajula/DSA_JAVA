class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int res=0;
        for(char c:s.toCharArray()){
            if(c == 'R'){
                count++;
            }else if(c=='L'){
                count--;
            }
            if(count == 0){
                res++;
            }
        }
       return res; 
    }
}
