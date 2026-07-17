class Thermostat {

    // Private instance variables
    private String location;
    private int temperature;

    // Static constants
    private static final int MIN = 16;
    private static final int MAX = 30;

    // Static variable
    private static int activeCount = 0;

    // Constructor with location and starting temperature
    public Thermostat(String location, int startTemp) {
        this.location = location;

        if (startTemp >= MIN && startTemp <= MAX) {
            this.temperature = startTemp;
        } else {
            this.temperature = 22;
        }

        activeCount++;
    }

    // Constructor with only location
    public Thermostat(String location) {
        this(location, 22);
    }

    // Raise temperature
    public void raise() {
        if (temperature < MAX) {
            temperature++;
        } else {
            System.out.println("Already at maximum (30)");
        }
    }

    // Lower temperature
    public void lower() {
        if (temperature > MIN) {
            temperature--;
        } else {
            System.out.println("Already at minimum (16)");
        }
    }

    // Getter for temperature
    public int getTemperature() {
        return temperature;
    }

    // Getter for location
    public String getLocation() {
        return location;
    }

    // Static getter for active count
    public static int getActiveCount() {
        return activeCount;
    }

}

public class Main {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("Living Room");
        Thermostat t2 = new Thermostat("Bedroom", 25);

        System.out.println("Raising temperature of " + t1.getLocation() + ":");

        for (int i = 0; i < 10; i++) {
            t1.raise();
            System.out.println("Temperature: " + t1.getTemperature());
        }

        System.out.println();

        System.out.println("Lowering temperature of Living Room:");

        for (int i = 0; i < 20; i++) {
            t1.lower();
            System.out.println("Temperature: " + t1.getTemperature());
        }

        System.out.println();

        System.out.println("Active Thermostats: " + Thermostat.getActiveCount());
    }
}
