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

        String a = "a";
        String b = "a";
        String c = new String("a");

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

}
