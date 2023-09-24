package LeetCode.Easy;
/*
 * Write a function that takes the binary representation of an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

Note:

Note that in some languages, such as Java, there is no unsigned integer type. In this case, the input will be given as a signed integer type. It should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 3, the input represents the signed integer. -3.
 

Example 1:

Input: n = 00000000000000000000000000001011
Output: 3
Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
 */
public class HammingWeight {

    public static void main(String[] args) {
        System.out.println("Hamming weight :: "+getHammingWeight(00000000110101110));
    }

    public static int getHammingWeight(int n){

        n = n - ((n>>1) & 0x55555555);
        n = (n & 0x33333333) + ((n>>2) & 0x33333333);
        int count = ((n + (n>>4) & 0xF0F0F0F) * 0x1010101) >> 24;
        return count;
    }
}