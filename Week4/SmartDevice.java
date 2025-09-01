public class SmartDevice {
    private String deviceName;
    private String location;
    private boolean isOnline;
    private double powerConsumption;
    private String[] connectedDevices;
    private int connectionCount;

    // TODO: Constructor with parameter names matching field names
    public SmartDevice(String deviceName, String location, boolean isOnline, double powerConsumption) {
        // TODO: Use this keyword to distinguish between parameters and fields
        this.deviceName = deviceName;
        this.location = location;
        this.isOnline = isOnline;
        this.powerConsumption = powerConsumption;
        // TODO: Initialize connectedDevices array (size 5)
        this.connectedDevices = new String[5];
        // TODO: Set connectionCount to 0
        this.connectionCount = 0;
    }

    // TODO: Method using this for parameter disambiguation
    public void updateLocation(String location) {
        // TODO: Use this.location to assign parameter value
        this.location = location;
        System.out.println(this.deviceName + " moved to " + this.location);
    }

    public void updatePowerConsumption(double powerConsumption) {
        // TODO: Use this keyword when parameter name matches field
        this.powerConsumption = powerConsumption;
        System.out.println("Power consumption updated for " + this.deviceName);
    }

    // TODO: Method returning this for chaining
    public SmartDevice setOnline(boolean isOnline) {
        // TODO: Use this keyword and return this for method chaining
        this.isOnline = isOnline;
        return this;
    }

    public SmartDevice connectToDevice(String deviceName) {
        // TODO: Add device to connectedDevices array
        if (this.connectionCount < this.connectedDevices.length) {
            this.connectedDevices[this.connectionCount] = deviceName;
            this.connectionCount++;
            System.out.println(this.deviceName + " connected to " + deviceName);
        }
        return this; // Enable method chaining
    }

    public SmartDevice rename(String deviceName) {
        // TODO: Use this keyword for disambiguation
        String oldName = this.deviceName;
        this.deviceName = deviceName;
        System.out.println("Device renamed from " + oldName + " to " + this.deviceName);
        return this;
    }

    public void displayDeviceInfo() {
        // TODO: Use this keyword to access instance variables
        System.out.println("\n=== " + this.deviceName + " INFO ===");
        System.out.println("Location: " + this.location);
        System.out.println("Status: " + (this.isOnline ? "Online" : "Offline"));
        System.out.println("Power: " + this.powerConsumption + "W");
        System.out.println("Connections: " + this.connectionCount);
        for (int i = 0; i < this.connectionCount; i++) {
            System.out.println("  -> " + this.connectedDevices[i]);
        }
    }

    // TODO: Method that calls other methods using this
    public void performInitialSetup() {
        // TODO: Use this to call other methods
        this.setOnline(true);
        System.out.println(this.deviceName + " initial setup completed");
    }

    public static void main(String[] args) {
        System.out.println("=== SMART HOME DEVICE NETWORK ===");
        // TODO: Create devices with parameter names matching field names
        SmartDevice smartHub = new SmartDevice("Main Hub", "Living Room", false, 5.5);
        smartHub.displayDeviceInfo();

        // TODO: Demonstrate this keyword in various contexts
        smartHub.performInitialSetup(); // 'this' calls another method
        smartHub.displayDeviceInfo();

        // TODO: Show parameter disambiguation scenarios
        smartHub.updateLocation("Kitchen"); // 'this' for disambiguation
        smartHub.displayDeviceInfo();

        // TODO: Test method chaining using returned this
        System.out.println("\n--- Testing Method Chaining ---");
        smartHub.setOnline(true)
                .connectToDevice("Smart Light")
                .connectToDevice("Thermostat")
                .rename("Kitchen Hub");

        smartHub.displayDeviceInfo();
    }
}