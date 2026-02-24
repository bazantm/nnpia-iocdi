package cz.upce.fei.nnpia.pred02beans.core;

public class WheelFactory {

    public Wheel getWheel() {
        return new MichelinWheel();
    }
}
