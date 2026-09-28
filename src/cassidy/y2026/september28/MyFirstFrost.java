package cassidy.y2026.september28;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of daily temperatures and a number drop, 
 * return an array where each element is how many days you'd wait until it's at least drop degrees colder than that day. 
 * If that never happens, put 0.
 */
public class MyFirstFrost {
    private static final int DEFAULT_VALUE = 0;

    static void main() {
        firstFrost(List.of(70, 68, 72, 60, 65, 55), 5);
        firstFrost(List.of(50, 49, 48), 5);
        firstFrost(List.of(40, 30, 45, 20), 10);
    }

    private static void firstFrost(final List<Integer> dailyTemperatures, final int drop) {
        List<Integer> output = new ArrayList<>(dailyTemperatures.size());

        for (int i = 0; i < dailyTemperatures.size(); i++) {
            int requiredTemp = dailyTemperatures.get(i) - drop;
            output.add(i, DEFAULT_VALUE);

            for (int j = i + 1, count = 1; j < dailyTemperatures.size(); j++, count++) {
                int currTemp = dailyTemperatures.get(j);
                if (currTemp <= requiredTemp) {
                    output.set(i, count);
                    break;
                }
            }
        }

        System.out.println(output);
    }
}
