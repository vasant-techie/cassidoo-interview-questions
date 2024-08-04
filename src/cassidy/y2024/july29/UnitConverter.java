package cassidy.y2024.july29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a function that converts between metric and imperial units.
 * Break up the units into millimeters, centimeters, and meters for metric,
 * and into inches and feet for imperial, up to 2 decimal places.
 */
public class UnitConverter {

    private static final List<String> metricUnits = Arrays.asList("mm", "cm", "m", "km");
    private static final List<String> imperialUnits = Arrays.asList("in", "ft", "yd", "mi");

    public static void main(String[] args) {
        convertUnits(7, "ft");
    }

    private static void convertUnits(int value, String unit) {

    }
}
