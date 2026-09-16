package cassidy.y2026.september05;

import java.util.List;
import java.util.Scanner;

/**
 * This is an ** incomplete ** code.
 *
 * Given an integer n representing the number of steps in a staircase,
 * return the number of distinct ways you can reach
 * the top if you can climb either 1 or 2 steps at a time.
 */
public class CountStairs {

    private static final List<Integer> TOTAL_CLIMB_COUNT_LIST = List.of(1, 2);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        countStairs(in);
    }

    private static void countStairs(int in) {
        for (int i = 0; i < in; i++) {

        }
    }
}
