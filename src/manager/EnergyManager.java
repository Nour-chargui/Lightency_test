package manager;

import components.Battery;
import components.Component;
import java.util.ArrayList;
import java.util.List;

public class EnergyManager {
    private List<Component> components = new ArrayList<>();

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    public int calculateTotalCapacity() {
        int totalCapacity = 0;
        for (Component component : components) {
            if (component != null) {
                totalCapacity += (component instanceof Battery) ? ((Battery) component).getCapacity() : 0;
            }
        }
        return totalCapacity;
    }
}
