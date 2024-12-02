package cassidy.y2024.december02;

import java.util.*;
import java.util.stream.*;

public class ReverseAndSortNames {
    public static void main(String[] args) {
        System.out.println(rollCall(new String[]{"yzneT","ydissaC","enimA"}));
        System.out.println(rollCall(new String[]{"rennuD","nexiV","recnarP","temoC","neztilB","recnaD","diduC","rehsaD","hploduR"}));
        System.out.println(rollCall(new String[]{"A","B","C"}));
    }

    private static List<String> rollCall(String[] reindeerNames) {
        return Arrays.stream(reindeerNames).map(r -> new StringBuilder(r).reverse().toString()).sorted().collect(Collectors.toList());
    }
}
