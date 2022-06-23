package ua.lviv.iot.javalab1;

public record Refrigerator(
        String manufacturer, double volume, double weight,
        double powerConsumption, double maxTemperature, String serialNumber) {
    private static int totalCount;
    public Refrigerator() {
        this("", 0, 0, 0, 0, "S0000A0");
    }

    public Refrigerator(String manufacturer, double volume, double weight) {
        this(manufacturer, volume, weight, 0, 0, "S0000A0");
    }

    @Override
    public String toString() {
        return "Refrigerator:\n- Manufacturer: " + this.manufacturer +
                "\n- Volume: " + this.volume + "\n-  Weight: " + this.weight +
                "\n- Power Consumption: " + this.powerConsumption + "\n- Max Temperature: " + this.maxTemperature +
                "\n- Serial number: " + this.serialNumber;
    }

    public static int getTotalCount() {
        return totalCount;
    }
}
