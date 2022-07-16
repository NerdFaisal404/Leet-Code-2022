package medium;

public class LeetCode7 {

    public static void main(String[] args) {
        LeetCode7 solution = new LeetCode7();
        System.out.println(solution.reverse(9000000));
    }

    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            if ((reversed > Integer.MAX_VALUE / 10) || (reversed < Integer.MIN_VALUE / 10))
                return 0;

            reversed = reversed * 10 + lastDigit;
            x = x / 10;
        }

        return reversed;
    }
}
