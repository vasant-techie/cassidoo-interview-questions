package cassidy.y2024.december02;

import java.util.*;
import java.util.stream.*;

public class ReverseAndSortNames {
    public static void main(String[] args) {
        System.out.println(rollCall(new String[]{"yzneT","ydissaC","enimA"}));
        System.out.println(rollCall(new String[]{"rennuD","nexiV","recnarP","temoC","neztilB","recnaD","diduC","rehsaD","hploduR"}));
        System.out.println(rollCall(new String[]{"A","B","C"}));
        int []source = {1,2,3};

        System.out.println(sum(source));
    }

    private static List<String> rollCall(String[] reindeerNames) {
        return Arrays.stream(reindeerNames).map(r -> new StringBuilder(r).reverse().toString()).sorted().collect(Collectors.toList());
    }

    public static int sum ( int [] input){
        // sum of the array
        final int[] sum = {0};
        Arrays.stream(input).forEach( e ->
        {
            sum[0] = sum[0] +e;
        });
        System.out.println(sum[0]);
        return Arrays.stream(input).sum();

    }

    private void testNaveen() {
        while(true) {
            int x = 1;
            System.out.println(x);
            x++;
            if(x == 4) {
                break;
            }
        }
    }

}
