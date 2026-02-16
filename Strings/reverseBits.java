//given a 32 bit integer 
//return the reversed 32 bit integer of the input

class Solution {
    public int reverseBits(int n) {

    int result = 0;

    for (int i = 0; i < 32; i++) {

        int lastBit = n & 1;   

        result <<= 1;          

        result |= lastBit;     

        n >>= 1;               
    }

    return result;
}

}
