package LeetCode.Easy;

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