package OOPS;

/*
 * BASE INTERFACE
 * Represents WHAT every vehicle can do
 */
interface Vehicle {

    void start();
    void stop();

    /*
     * DEFAULT METHOD
     * Optional common behavior
     */
    default void serviceInfo() {
        System.out.println("General vehicle servicing required");
    }
}

/* ================= FEATURE INTERFACES ================= */

interface FuelVehicle {

    default String fuelType() {
        return "Petrol/Diesel";
    }
}

interface ElectricVehicle {

    default void charge() {
        System.out.println("Charging the electric vehicle");
    }
}

interface ManualVehicle {

    default void gearType() {
        System.out.println("Manual transmission");
    }
}

/* ================= IMPLEMENTATIONS ================= */

class PetrolCar implements Vehicle, FuelVehicle, ManualVehicle {

    @Override
    public void start() {
        System.out.println("Petrol car started");
    }

    @Override
    public void stop() {
        System.out.println("Petrol car stopped");
    }
}

class ElectricCar implements Vehicle, ElectricVehicle {

    @Override
    public void start() {
        System.out.println("Electric car started silently");
    }

    @Override
    public void stop() {
        System.out.println("Electric car stopped");
    }
}

class HybridCar implements Vehicle, FuelVehicle, ElectricVehicle {

    @Override
    public void start() {
        System.out.println("Hybrid car started");
    }

    @Override
    public void stop() {
        System.out.println("Hybrid car stopped");
    }

    // Diamond conflict resolved explicitly
    @Override
    public String fuelType() {
        return "Petrol + Electric";
    }
}

/* ================= DIAMOND PROBLEM DEMO ================= */

interface A {
    default void run() {
        System.out.println("Running from interface A");
    }
}

interface B {
    default void run() {
        System.out.println("Running from interface B");
    }
}

class C implements A, B {

    @Override
    public void run() {
        A.super.run(); // OR B.super.run() OR custom logic
        System.out.println("Custom run logic in class C");
    }
}

/* ================= MAIN ================= */

public class Question3 {

    public static void main(String[] args) {

        Vehicle petrolCar = new PetrolCar();
        Vehicle electricCar = new ElectricCar();
        Vehicle hybridCar = new HybridCar();

        // Petrol Car
        petrolCar.start();
        petrolCar.serviceInfo();
        System.out.println("Fuel: " + ((FuelVehicle) petrolCar).fuelType());
        ((ManualVehicle) petrolCar).gearType();
        petrolCar.stop();

        System.out.println();

        // Electric Car
        electricCar.start();
        electricCar.serviceInfo();
        ((ElectricVehicle) electricCar).charge();
        electricCar.stop();

        System.out.println();

        // Hybrid Car
        hybridCar.start();
        System.out.println("Fuel: " + ((FuelVehicle) hybridCar).fuelType());
        ((ElectricVehicle) hybridCar).charge();
        hybridCar.stop();

        System.out.println();

        // Diamond Problem Example
        C obj = new C();
        obj.run();
    }
}
