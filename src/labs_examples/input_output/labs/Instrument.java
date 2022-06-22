package labs_examples.input_output.labs;

public class Instrument {

    private int num;
    private String name;
    private String family;
    private double octaves;

    public Instrument(int num, String name, String family, double octaves) {
        this.num = num;
        this.name = name;
        this.family = family;
        this.octaves = octaves;
    }

    public Instrument (){

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public double getOctaves() {
        return octaves;
    }

    public void setOctaves(double octaves) {
        this.octaves = octaves;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "num=" + num + '\'' +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", octaves=" + octaves +
                '}';
    }
}
