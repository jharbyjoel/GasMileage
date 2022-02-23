package app;

import java.util.Scanner;
import vehicle.Vehicle;


public class Controller {

    public static void main(String[] args){

        Vehicle vehicle = new Vehicle();
        System.out.println("How many gallons does your gas tank hold?\n");
        System.out.println(vehicle.getTankSize());
        System.out.println("\nWhat is the average MPG of the vehicle?\n");
        System.out.println(vehicle.getEfficiency());
        System.out.println("\nReading your vehicle's current fuel level... \n\n" + vehicle.getFuelInTank());
        System.out.println();
        vehicle.addPetrol();
        vehicle.driveTo();







    }
}
