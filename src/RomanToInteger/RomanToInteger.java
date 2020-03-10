package RomanToInteger;

import java.util.HashMap;
import java.util.Map;

// Notes: Learned about hashmaps and how they work today!
// I can get using .get() and charAt() for strings.

public class RomanToInteger {

    public int calculate(String s) {
        Map<Character, Integer> charToInt = new HashMap<>();

        charToInt.put('I', 1);
        charToInt.put('V', 5);
        charToInt.put('X', 10);
        charToInt.put('L', 50);
        charToInt.put('C', 100);
        charToInt.put('D', 500);
        charToInt.put('M', 1000);

        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'I' && i < s.length() - 1 && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                res -= charToInt.get(c);
            } else if (c == 'X' && i < s.length() - 1 && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                res -= charToInt.get(c);
            } else if (c == 'C' && i < s.length() - 1 && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                res -= charToInt.get(c);
            } else {
                res += charToInt.get(c);
            }
        }

        return res;
    }



    public static void main(String[] args) {
        RomanToInteger roman = new RomanToInteger();
        System.out.println(roman.calculate("CDXIII"));
    }
}
