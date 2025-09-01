public class GameController {
    // TODO: Instance variables for controller configuration
    private String controllerBrand;
    private String connectionType;
    private boolean hasVibration;
    private int batteryLevel;
    private double sensitivity;

    // TODO: Default constructor - creates standard gaming setup
    public GameController() {
        // TODO: Set default values:
        this.controllerBrand = "GenericPad";
        this.connectionType = "USB";
        this.hasVibration = true;
        this.batteryLevel = 100;
        this.sensitivity = 1.0;
    }

    // TODO: Parameterized constructor for custom configuration
    public GameController(String controllerBrand, String connectionType, boolean hasVibration, int batteryLevel, double sensitivity) {
        // TODO: Initialize all fields with provided values
        this.controllerBrand = controllerBrand;
        this.connectionType = connectionType;
        this.hasVibration = hasVibration;
        // TODO: Validate battery level (0-100) and sensitivity (0.1-3.0)
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        } else {
            this.batteryLevel = 100; // Default value if invalid
        }
        if (sensitivity >= 0.1 && sensitivity <= 3.0) {
            this.sensitivity = sensitivity;
        } else {
            this.sensitivity = 1.0; // Default value if invalid
        }
    }

    // TODO: Two-parameter convenience constructor
    public GameController(String brand, String connectionType) {
        // TODO: Set provided values and use defaults for others
        this.controllerBrand = brand;
        this.connectionType = connectionType;
        this.hasVibration = true;
        this.batteryLevel = 100;
        this.sensitivity = 1.5;
    }

    // TODO: Methods to test functionality
    public void calibrateController() {
        System.out.println("Calibrating " + controllerBrand + " controller...");
    }

    public void displayConfiguration() {
        // TODO: Print all controller settings
        System.out.println("--- Controller Configuration ---");
        System.out.println("Brand: " + this.controllerBrand);
        System.out.println("Connection: " + this.connectionType);
        System.out.println("Vibration: " + (this.hasVibration ? "Enabled" : "Disabled"));
        System.out.println("Battery: " + this.batteryLevel + "%");
        System.out.println("Sensitivity: " + this.sensitivity);
        System.out.println("--------------------------------");
    }

    public void testVibration() {
        if (hasVibration) {
            System.out.println("*BUZZ* Vibration test successful!");
        } else {
            System.out.println("Vibration disabled on this controller.");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== GAMING CONTROLLER SETUP ===");

        // TODO: Create controller with default constructor
        GameController defaultConfig = new GameController();
        System.out.println("\n--- Default Controller ---");
        defaultConfig.displayConfiguration();
        defaultConfig.calibrateController();
        defaultConfig.testVibration();


        // TODO: Create controller with full parameterized constructor
        GameController customConfig = new GameController("ProGamerX", "Bluetooth", true, 85, 2.5);
        System.out.println("\n--- Custom Controller ---");
        customConfig.displayConfiguration();
        customConfig.calibrateController();
        customConfig.testVibration();

        // TODO: Create controller with convenience constructor
        GameController quickConfig = new GameController("QuickPlay", "Wireless");
        System.out.println("\n--- Convenience Controller ---");
        quickConfig.displayConfiguration();
        quickConfig.calibrateController();
        quickConfig.testVibration();
    }
}
