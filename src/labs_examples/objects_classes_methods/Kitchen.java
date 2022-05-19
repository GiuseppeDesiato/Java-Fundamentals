package labs_examples.objects_classes_methods;

public class Kitchen {

    Dishwasher dishwasher;
    Oven oven;
    Refrigerator refrigerator;
    Sink sink;

    public Kitchen(Dishwasher dishwasher, Oven oven, Refrigerator refrigerator, Sink sink) {
        this.dishwasher = dishwasher;
        this.oven = oven;
        this.refrigerator = refrigerator;
        this.sink = sink;
    }

    public Dishwasher getDishwasher() {
        return dishwasher;
    }

    public void setDishwasher(Dishwasher dishwasher) {
        this.dishwasher = dishwasher;
    }

    public Oven getOven() {
        return oven;
    }

    public void setOven(Oven oven) {
        this.oven = oven;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    public Sink getSink() {
        return sink;
    }

    public void setSink(Sink sink) {
        this.sink = sink;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "dishwasher=" + dishwasher +
                ", oven=" + oven +
                ", refrigerator=" + refrigerator +
                ", sink=" + sink +
                '}';
    }
}
