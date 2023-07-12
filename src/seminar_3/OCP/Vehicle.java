package seminar_3.OCP;

public class Vehicle {
    int maxSpeed;
    String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getType() {
        return this.type;
    }

    public double calculateAllowedSpeed() {
        return maxSpeed;
    }
}

public class Car extends Vehicle {
    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double calculateAllowedSpeed() {
        return super.maxSpeed * 0.8;
    }
}

public class Bus extends Vehicle {
    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double calculateAllowedSpeed() {
        return super.maxSpeed * 0.8;
    }
}

// public class SpeedCalculation {
// public double calculateAllowedSpeed(Vehicle vehicle) {
// if (vehicle.getType().equalsIgnoreCase("Car")) {
// return vehicle.getMaxSpeed() * 0.8;
// } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
// return vehicle.getMaxSpeed() * 0.6;
// }
// return 0.0;
// }
// }
