package components;

public class SolarPanel extends Component {
    private int power;

    public SolarPanel(int power) {
        if (power < 0) {
            throw new IllegalArgumentException("Power cannot be negative.");
        }
        this.power = power;
    }

    @Override
    public String getDetails() {
        return "Solar Panel - Power: " + power + " kW";
    }

    public int generatePower() {
        if (power < 0) {
            throw new IllegalArgumentException("Power generation cannot be negative.");
        }

        return power;
    }
}
