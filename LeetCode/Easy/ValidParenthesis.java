package LeetCode.Easy;

/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 */
class ValidParenthesis{

    public static void main(String[] args) {
        
        System.out.println(isValid("{()}"));
    }

    public static boolean isValid(String s){

        char[] stack = new char[s.length()];
        int c1 =-1;
    
        if(s.length()%2 == 1){
            return false;
        }
        for(int i = 0;i< s.length();i++){

            switch(s.charAt(i)){

                case '(':
                case '{':
                case '[':
                    stack[++c1] = s.charAt(i);
                    break;
                case ')':
                case '}':
                case ']':
                    if(c1 == -1){
                        return false;
                    }
                    if((stack[c1] == '(' && s.charAt(i) == ')') || (stack[c1] == '{' && s.charAt(i) == '}') || (stack[c1] == '[' && s.charAt(i) == ']')){

                        stack[c1] = 0;
                        c1--;
                    } else{
                        return false;
                    }

            }
        }
        if(stack[0] != 0){
            return false;
        }

        return true;
    }
}