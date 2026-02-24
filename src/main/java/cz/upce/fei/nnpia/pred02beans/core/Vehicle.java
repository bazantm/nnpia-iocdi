package cz.upce.fei.nnpia.pred02beans.core;

public class Vehicle {

    //zavislost na objektech
    //zadne IoC, zadne DI
    public void makeVehicle() {
        // SonySpeaker speaker = new SonySpeaker();
        BoseSpeaker speaker = new BoseSpeaker();
        System.out.println(speaker.makeSound());

        // MichelinWheel wheel = new MichelinWheel();
        BridgeStoneWheel wheel = new BridgeStoneWheel();
        System.out.println(wheel.moveVehicle());
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.makeVehicle();
    }

}
