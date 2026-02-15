//  Time   | O(n)  
//  Space  | O(n)  

class Solution {
    public String addBinary(String a, String b) {
      //the below commented code for small strings
        // int a1 = Integer.parseInt(a,2);//parse with base2
        // int b1 = Integer.parseInt(b,2);
        // int sum = a1+b1;
        // String result = Integer.toBinaryString(sum);

        // return result;

        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        StringBuilder res = new StringBuilder();

        while(i>=0 || j>=0 || carry==1){
            int sum = carry;
            if(i>=0){
                sum+=a.charAt(i) - '0';
                i--;
            }
            if(j>=0){
                sum += b.charAt(j) - '0';
                j--;
            }

            res.append(sum%2);
            carry = sum/2;
        }
        return res.reverse().toString();

    }
}
