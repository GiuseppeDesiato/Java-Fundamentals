package labs_examples.objects_classes_methods.labs.objects;


public class Airplane {

    public static void main(String[] args) {

        Turbine myTurbine = new Turbine( 4);

        myTurbine.setTurbineNum(6);
        System.out.println("The new number of turbines is: " + myTurbine.getTurbineNum());
        System.out.println(myTurbine.toString());


        Seats mySeats = new Seats(3);

        mySeats.setRows(4);
        System.out.println("The new number of rows is: " + mySeats.getRows());
        System.out.println(mySeats.toString());


        Speed mySpeed = new Speed( 801.5);

        mySpeed.setSpeedVal(789.3);
        System.out.println("The new speed is: " + mySpeed.getSpeedVal());
        System.out.println(mySpeed.toString());


        Color myColor = new Color("blue");

        myColor.setColor("white");
        System.out.println("The new color is: " + myColor.getColor());
        System.out.println(myColor.toString());

        double fuelCapacity = 100;
        double currentFuelLevel = 87.5;

        System.out.println("The plane has the fuel capacity of: " + fuelCapacity +
                " gallons. And its current fuel capacity is of " + currentFuelLevel);

    }
}

class Turbine{

    private int turbineNum;

    public Turbine(int turbineNum) {
        this.turbineNum = turbineNum;
    }
    public int getTurbineNum() {
        return turbineNum;
    }
    public void setTurbineNum(int turbineNum) {
        this.turbineNum = turbineNum;
    }

    @Override
    public String toString() {
        return "Turbine{" +
                "turbineNum=" + turbineNum +
                '}';
    }
}

class Seats{

    private int rows;

    public Seats(int rows){
        this.rows = rows;
    }


    public int getRows() {
        return rows;
    }
    public void setRows(int rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "Seats{" +
                "rows=" + rows +
                '}';
    }
}

class Speed{

    private double speedVal;

    public Speed(double speedVal){
        this.speedVal = speedVal;
    }


    public double getSpeedVal() {
        return speedVal;
    }
    public void setSpeedVal(double speedVal) {
        this.speedVal = speedVal;
    }

    @Override
    public String toString() {
        return "Speed{" +
                "speedVal=" + speedVal +
                '}';
    }
}

class Color{

    private String color;

    public Color(String color) {
        this.color = color;
    }


    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Color{" +
                "color='" + color + '\'' +
                '}';
    }

}
