/*

Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type

 */


import java.util.Stack;

public class Problem20 {

    public static void main(String[] args) {

        System.out.println(isValid("(())"));

    }

    static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else{

                if (stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();

                if (ch==')' && top!='('){
                    return false;
                }
                if (ch=='}' && top!='{'){
                    return false;
                }
                if (ch==']' && top!='['){
                    return false;
                }
            }


        }

        return stack.isEmpty();

    }

}
