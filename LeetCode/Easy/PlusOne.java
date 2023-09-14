package LeetCode.Easy;

public class PlusOne {

    public static void main(String[] args) {

        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        int[] result = plusOne(arr);
        System.out.println(result);
    }

    public static int[] plusOne(int[] digits){
        
        for(int j = digits.length-1; j>=0;j--){

            if(digits[j]<9){
                digits[j]++;
                return digits;
            } else{
                digits[j] = 0;
            }
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;

        return digits;
    }
    
}
