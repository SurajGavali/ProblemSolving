package LeetCode.Easy;

public class PalindromeNumber {
    
    public static void main(String[] args) {

        boolean flag = isPalindrome();
        System.out.println(flag);
    }

    public static boolean isPalindrome(){

        int number1 = 121;
        int temp = number1;
        int number2 =0;

        int num1 = 0;
        while(number1>0){

            number2 = num1*10 + (number1%10);
            num1 = number2;
            number1 = number1 / 10;
        }

        System.out.println(number2 + " " + number1);
        if(temp == number2){
            return true;
        } else{
            return false;
        }
    }
}
