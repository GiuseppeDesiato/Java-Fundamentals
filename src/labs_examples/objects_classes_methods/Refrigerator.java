package labs_examples.objects_classes_methods;

public class Refrigerator {

    private boolean isdoubleWide;
    private String brand;
    private double volume;

    public Refrigerator(boolean isdoubleWide, String brand, double volume) {
        this.isdoubleWide = isdoubleWide;
        this.brand = brand;
        this.volume = volume;
    }

    public boolean isIsdoubleWide() {
        return isdoubleWide;
    }

    public void setIsdoubleWide(boolean isdoubleWide) {
        this.isdoubleWide = isdoubleWide;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "isdoubleWide=" + isdoubleWide +
                ", brand='" + brand + '\'' +
                ", volume=" + volume +
                '}';
    }
}
