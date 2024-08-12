package cassidy.y2024.august12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindUnused {
    public static void main(String[] args) {
        findUnused(new String[]{"a = 1", "b = a", "c = 2", "log(b)"});
    }

    private static void findUnused(String[] logs) {
        //parse input
        Map<String, String> set = new HashMap<>();
        String logValue = null;
        for(String v: logs) {
            if(v.startsWith("log")) {
                logValue = v.substring(v.indexOf("(") + 1, v.indexOf(")")).trim();
            } else {
                String[] values = v.split("=");
                set.put(values[0].trim(), values[1].trim());
            }
        }
        //computation
        Set<String> unused = computeUnused(set, logValue);
        System.out.println(unused);
    }

    private static Set<String> computeUnused(Map<String, String> set, String logValue) {
        String value = set.get(logValue);
        if(null == value || null == getKey(set, value)) {
            return set.keySet();
        } else {
            set.remove(logValue);
            return computeUnused(set, value);
        }
    }

    private static String getKey(Map<String, String> set, String value) {
        Set<Map.Entry<String, String>> entries = set.entrySet();
        for(Map.Entry<String, String> entry: entries) {
            if(value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
