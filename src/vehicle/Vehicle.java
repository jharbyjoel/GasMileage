package vehicle;

import java.util.Scanner;

public class Vehicle {

    //variables

    private double tankSize;
    private double efficiency;
    private double fuelInTank = 0;
    private  double availableTankCapacity;

    //constructor


    public Vehicle(){



    }
    public double getAvailableTankCapacity() {
        availableTankCapacity = tankSize - fuelInTank;
        return availableTankCapacity;
    }
    public double getTankSize() {
        Scanner userInput = new Scanner(System.in);
        double usersTank = userInput.nextDouble();
        System.out.println("\nUpdating your tank's total capacity...\n");
        tankSize = usersTank;
        return usersTank;
    }


    public double getEfficiency() {
        Scanner userInput = new Scanner(System.in);
        double usersEfficiency = userInput.nextDouble();
        System.out.println("\nUpdating your vehicle's fuel efficiency...\n");
        efficiency = usersEfficiency;
        return usersEfficiency;
    }


    public double getFuelInTank() {
        return fuelInTank;
    }

    public void addPetrol() {
        System.out.println("How many gallons of gas do you wish to add?\n");
        Scanner addGas = new Scanner(System.in);
        double gasAdded = addGas.nextDouble();
        if (gasAdded > getAvailableTankCapacity()) {
            System.out.println("\nError! Your gas tank is too small." );
        } else {
            System.out.printf("\nGas being added...\n");
            System.out.printf("\nUpdated fuel in Tank: %.2f\t", gasAdded + fuelInTank);
            System.out.println();
        }

    }
    public void driveTo(){

        System.out.println();
        System.out.printf("Miles available to travel with current gas:\n%.2f", tankSize * efficiency);


    }


}
