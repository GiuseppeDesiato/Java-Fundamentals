package labs_examples.enumerations.labs;

public class Exercise_01_b {

    public static void main(String[] args) {

        WaterTemp waterTemp = WaterTemp.COLD;
        System.out.println(waterTemp.getAction());

    }
}

enum WaterTemp {
    COLD("too cold, open hot water."),
    WARM("perfect temperature."),
    HOT("too hot, open cold water.");

    private final String action;

    public String getAction() {
        return action;
    }

    private WaterTemp(String action) {
        this.action = action;
    }
}
