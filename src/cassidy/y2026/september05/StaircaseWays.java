package cassidy.y2026.september05;

public class StaircaseWays {

    /**
     * Returns the number of distinct ways to reach the top of a staircase
     * with n steps, when you can climb either 1 or 2 steps at a time.
     *
     * This is the classic "climbing stairs" problem, equivalent to computing
     * the (n+1)-th Fibonacci number.
     *
     * @param n number of steps (n >= 0)
     * @return number of distinct ways to reach the top
     */
    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }

        int prev2 = 1; // ways to reach step 0
        int prev1 = 1; // ways to reach step 1

        for (int i = 2; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    // Example usage
    public static void main(String[] args) {
        int[] testCases = {0, 1, 2, 3, 4, 5, 10};

        for (int n : testCases) {
            System.out.println("n = " + n + " -> ways = " + climbStairs(n));
        }
    }
}
