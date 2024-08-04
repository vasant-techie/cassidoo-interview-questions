package cassidy.y2024.june17;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class NameSortedByVowels {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Goku", "Vegeta", "Piccolo", "Gohan");
        List<String> sortedNames = sortNames(names);
        System.out.println("Sorted Names: " + sortedNames);
    }

    private static List<String> sortNames(List<String> names) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

        names.stream().forEach(n -> {
            char[] chAr = n.toCharArray();

        });
        return null;
    }
}
