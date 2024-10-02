/*


Given an integer x, return true if x is a palindrome, and false otherwise.


Follow up: Could you solve it without converting the integer to a string?

 */



import java.util.HashMap;
import java.util.Map;

class Problem9 {

    public static void main(String[] args) {


        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(100));

    }

    static boolean isPalindrome(int x) {

        if(x<0 || ( x%10==0 && x!=0)){
            return false;
        }

        int reversedHalf = 0;

        while(x>reversedHalf){
            reversedHalf = reversedHalf * 10 + x%10;
            x /=10;
        }

        return (x==reversedHalf || x==reversedHalf/10);

    }
}