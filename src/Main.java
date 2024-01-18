
import components.Battery;
import components.SolarPanel;
import manager.EnergyManager;

public class Main {
    public static void main(String[] args) {
        try {
            EnergyManager energyManager = new EnergyManager();

            // Example with valid inputs
            Battery battery1 = new Battery(100);
            Battery battery2 = new Battery(150);
            SolarPanel solarPanel1 = new SolarPanel(50);


            energyManager.addComponent(battery1);
            energyManager.addComponent(battery2);
            energyManager.addComponent(solarPanel1);

            System.out.println("Total Capacity: " + energyManager.calculateTotalCapacity() + " kWh");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
