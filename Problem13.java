/*


Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000



 */


import java.util.HashMap;
import java.util.Map;

public class Problem13 {

    public static void main(String[] args) {

        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));



        System.out.println(romanToIntMoreEfficient("III"));
        System.out.println(romanToIntMoreEfficient("LVIII"));
        System.out.println(romanToIntMoreEfficient("MCMXCIV"));

    }


    static int romanToIntMoreEfficient(String s) {

        int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;



    }

    static int romanToInt(String s){

        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {

            int currentValue = romanMap.get(s.charAt(i));

            if (i + 1 < n && currentValue < romanMap.get(s.charAt(i + 1))) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
        }

        return total;

    }
}
