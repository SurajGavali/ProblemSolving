package LeetCode.Easy;

class ValidParenthesis{

    public static void main(String[] args) {
        
        System.out.println(isValid("{()}"));
    }

    public static boolean isValid(String s){

        char[] stack = new char[s.length()/2];
        int c1 =0;
        int c2 = (s.length()/2) - 1;
        for(int i = 0;i< s.length();i++){

            switch(s.charAt(i)){

                case '(':
                case '{':
                case '[':
                    stack[c1] = s.charAt(i);
                    c1++;
                    break;
                case ')':
                case '}':
                case ']':
                    if((stack[c2] == '(' && s.charAt(i) == ')') || (stack[c2] == '{' && s.charAt(i) == '}') || (stack[c2] == '[' && s.charAt(i) == ']')){

                        c2--;
                    } else{
                        return false;
                    }

            }
        }
        return true;
    }
}