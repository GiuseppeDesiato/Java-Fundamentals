package labs_examples.inheritance;

public class Moto_1 extends Vehicle {

    private int frameSize;

    public Moto_1(double currentSpeed, double maxSpeed, String manufacturingDate, int frameSize) {
        super(currentSpeed, maxSpeed, manufacturingDate);
        this.frameSize = frameSize;
    }

    public int getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(int frameSize) {
        this.frameSize = frameSize;
    }
}
