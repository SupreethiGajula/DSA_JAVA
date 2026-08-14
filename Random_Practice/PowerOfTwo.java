package Random_Practice;

public class PowerOfTwo {
    //to find if a number is power of two in java
    //straight forward solution
    public static boolean isPowerOfTwo(int n) {
    if (n <= 0) {
        return false;
    }

    while (n > 1) {
        if (n % 2 != 0) {
            return false;
        }

        n = n / 2;
    }

    return true;
}
//solution using bit manipulation-preferred in interviews
public static boolean isPowerOfTwoTwo(int n) {
    return n > 0 && (n & (n - 1)) == 0;
}
}
