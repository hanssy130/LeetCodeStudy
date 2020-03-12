public class ReverseInteger {
    public int reverse(int x) {
        //Instantiates the solution
        int rev = 0;

        //While loop goes through x as long as it's not zero
        while (x != 0) {

            //Temporarily stores popped value by division.
            int pop = x % 10;
            x /= 10;
            // Checks if it's within Integer's max or min bounds.
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            // Once passed, adds the popped number to the reversed solution.
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();
        System.out.println(r.reverse(830));
    }
}
