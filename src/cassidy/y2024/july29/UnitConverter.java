package cassidy.y2024.july29;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a function that converts between metric and imperial units.
 * Break up the units into millimeters, centimeters, and meters for metric,
 * and into inches and feet for imperial, up to 2 decimal places.
 *
 * Example:
 *
 * > convertUnits(7, "ft")
 * > "2m 13cm 3.6mm"
 *
 * > convertUnits(44, "cm")
 * > "1ft 5.32in"
 *
 */
public class UnitConverter {

    private static final List<String> metricUnits = Arrays.asList("mm", "cm", "m", "km");
    private static final List<String> imperialUnits = Arrays.asList("in", "ft", "yd", "mi");

    //1 foot=0.3048 meters
    //1 meter=100 centimeters

    public static void main(String[] args) {
        convertUnits(7, "ft");
    }

    private static void convertUnits(int value, String unit) {
        unit = unit.toLowerCase();
        if(metricUnits.contains(unit))
            convertToImperialUnits(value, unit);
        else
            convertToMetricUnit(value, unit);
    }

    private static void convertToMetricUnit(int value, String unit) {
        float meter = value * 0.3048f;
        float centimeter = (0.133600f) * 100;
        float millimeter = (0.360000f) * 10;
        System.out.format("%fm %fcm %fmm", meter, centimeter, millimeter);
    }

    private static void convertToImperialUnits(int value, String unit) {

    }
}
