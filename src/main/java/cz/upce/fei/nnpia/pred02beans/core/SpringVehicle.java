package cz.upce.fei.nnpia.pred02beans.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringVehicle {

    @Autowired
    private Speaker speaker;

    @Autowired
    private Wheel wheel;

    public void makeVehicleUsingSpring() {
        System.out.println(speaker.makeSound());
        System.out.println(wheel.moveVehicle());
    }
}