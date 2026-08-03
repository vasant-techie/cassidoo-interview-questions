package cassidy.y2026.august03;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Reorder {
    public static void main(String[] args) {
        List<Character> a = List.of('C', 'D', 'E', 'F', 'G', 'H', 'J', 'I', 'L', 'K');
        List<Integer> b = List.of(3, 0, 4, 1, 2, 5, 7, 6, 9, 8);
        reorder(a, b);
    }

    private static void reorder(List<Character> charList, List<Integer> indexList) {
        Map<Integer, Character> map = new TreeMap<>();

        int charListSize = charList.size();
        int indexListSize = indexList.size();

        if (indexListSize != charListSize) {
            System.err.println("The size of the input index & character list is NOT equal");
            System.exit(-1);
        }
        else if (charListSize == 0) {
            System.err.println("The size is zero!");
            System.exit(-2);
        }
        else {
            for (int i = 0; i < charListSize; i++) {
                map.put(indexList.get(i), charList.get(i));
            }
            System.out.println(map.values());
        }
    }
}
