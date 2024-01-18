package components;

public class Battery extends Component {
    private int capacity;

    public Battery(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative.");
        }
        this.capacity = capacity;
    }

    @Override
    public String getDetails() {
        return "Battery - Capacity: " + capacity + " kWh";
    }

    public int getCapacity() {
        return capacity;
    }
}
