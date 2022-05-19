package labs_examples.objects_classes_methods;

public class Dishwasher {

    private boolean isEnergyEfficient;
    private String brand;
    private int years;

    public Dishwasher(boolean isEnergyEfficient, String brand, int years) {
        this.isEnergyEfficient = isEnergyEfficient;
        this.brand = brand;
        this.years = years;
    }

    public boolean isEnergyEfficient() {
        return isEnergyEfficient;
    }

    public void setEnergyEfficient(boolean energyEfficient) {
        isEnergyEfficient = energyEfficient;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Dishwasher{" +
                "isEnergyEfficient=" + isEnergyEfficient +
                ", brand='" + brand + '\'' +
                ", years=" + years +
                '}';
    }
}
