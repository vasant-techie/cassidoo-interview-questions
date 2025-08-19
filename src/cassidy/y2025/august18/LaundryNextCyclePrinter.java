package cassidy.y2025.august18;

public class LaundryNextCyclePrinter {
    public static void main(String[] args) {
        LaundryItem towel = createLaundryItem();
        System.out.println(towel.nextCycle());
        System.out.println(towel.nextCycle());
        LaundryItem shirt = createLaundryItem(); // new object - shirt
        System.out.println(towel.nextCycle());
        System.out.println(shirt.nextCycle()); // invoking shirt -> nextCycle()
        System.out.println(towel.nextCycle());
        System.out.println(towel.nextCycle());
        System.out.println(towel.nextCycle());
        System.out.println(towel.nextCycle());
        System.out.println(shirt.nextCycle()); // invoking shirt -> nextCycle()
        System.out.println(shirt.nextCycle()); // invoking shirt -> nextCycle()
        System.out.println(shirt.nextCycle()); // invoking shirt -> nextCycle()
        System.out.println(shirt.nextCycle()); // invoking shirt -> nextCycle()
        System.out.println(shirt.nextCycle()); // invoking shirt -> nextCycle()
        System.out.println(shirt.nextCycle()); // invoking shirt -> nextCycle()
        System.out.println(shirt.nextCycle()); // invoking shirt -> nextCycle()
        System.out.println(shirt.nextCycle()); // invoking shirt -> nextCycle()
        System.out.println(shirt.nextCycle()); // invoking shirt -> nextCycle()
    }

    public static LaundryItem createLaundryItem() {
        return new LaundryItem();
    }
}

class LaundryItem {
    private int currentCycle = -1;

    public String nextCycle() {
        this.currentCycle++;
        return switch (currentCycle) {
            case 0 -> "soak";
            case 1 -> "wash";
            case 2 -> "rinse";
            case 3 -> "spin";
            case 4 -> "dry";
            default -> "done";
        };
    }
}
