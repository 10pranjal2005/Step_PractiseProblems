public class AudioMixer {
    private String mixerModel;
    private int numberOfChannels;
    private boolean hasBluetoothConnectivity;
    private double maxVolumeDecibels;
    private String[] connectedDevices;
    private int deviceCount;

    // TODO: No-argument constructor using this() chaining
    public AudioMixer() {
        // TODO: Call three-parameter constructor with defaults
        this("StandardMix-8", 8, false);
        // Execution Order Note: This calls the 3-param constructor first.
    }

    // TODO: Two-parameter constructor using this() chaining
    public AudioMixer(String mixerModel, int numberOfChannels) {
        // TODO: Call three-parameter constructor with bluetooth disabled
        this(mixerModel, numberOfChannels, false);
        // Execution Order Note: This calls the 3-param constructor first.
    }

    // TODO: Three-parameter constructor using this() chaining
    public AudioMixer(String mixerModel, int numberOfChannels, boolean hasBluetoothConnectivity) {
        // TODO: Call main constructor with default max volume (120.0)
        this(mixerModel, numberOfChannels, hasBluetoothConnectivity, 120.0);
        // Execution Order Note: This calls the main 4-param constructor first.
    }

    // TODO: Main constructor - all parameters
    public AudioMixer(String mixerModel, int numberOfChannels, boolean hasBluetoothConnectivity, double maxVolumeDecibels) {
        // Execution Order Note: This is the first constructor body to execute.
        // TODO: Initialize all fields
        this.mixerModel = mixerModel;
        this.numberOfChannels = numberOfChannels;
        this.hasBluetoothConnectivity = hasBluetoothConnectivity;
        this.maxVolumeDecibels = maxVolumeDecibels;
        // TODO: Initialize connectedDevices array based on numberOfChannels
        this.connectedDevices = new String[numberOfChannels];
        // TODO: Set deviceCount to 0
        this.deviceCount = 0;
        // TODO: Print constructor execution message
        System.out.println("Main constructor executed for: " + this.mixerModel);
    }

    public void connectDevice(String deviceName) {
        if (deviceCount < connectedDevices.length) {
            connectedDevices[deviceCount] = deviceName;
            deviceCount++;
            System.out.println("Connected: " + deviceName);
        } else {
            System.out.println("All channels occupied!");
        }
    }

    public void displayMixerStatus() {
        System.out.println("\n=== " + mixerModel + " STATUS ===");
        System.out.println("Channels: " + numberOfChannels);
        System.out.println("Bluetooth: " + (hasBluetoothConnectivity ? "Enabled" : "Disabled"));
        System.out.println("Max Volume: " + maxVolumeDecibels + " dB");
        System.out.println("Connected Devices: " + deviceCount + "/" + numberOfChannels);
        for (int i = 0; i < deviceCount; i++) {
            System.out.println("  Channel " + (i + 1) + ": " + connectedDevices[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== MUSIC STUDIO SETUP ===");
        // TODO: Comment on constructor chaining execution order
        // The 'this()' call must be the first statement. The chain of constructors
        // is called until the main one is reached. The body of the main constructor
        // executes first, followed by the bodies of the calling constructors in reverse order.

        // TODO: Create mixer using no-argument constructor
        System.out.println("\nCreating default mixer...");
        AudioMixer defaultMixer = new AudioMixer();

        // TODO: Create mixer using two-parameter constructor
        System.out.println("\nCreating 2-param mixer...");
        AudioMixer simpleMixer = new AudioMixer("DJ-Mix2", 2);

        // TODO: Create mixer using three-parameter constructor
        System.out.println("\nCreating 3-param mixer...");
        AudioMixer bluetoothMixer = new AudioMixer("StudioPro-16", 16, true);

        // TODO: Create mixer using full constructor
        System.out.println("\nCreating full-spec mixer...");
        AudioMixer proMixer = new AudioMixer("LiveSound-24", 24, true, 130.5);

        // TODO: Connect different devices to each mixer
        defaultMixer.connectDevice("Microphone 1");
        bluetoothMixer.connectDevice("Laptop");
        bluetoothMixer.connectDevice("Synth");

        // TODO: Display status of all mixers
        defaultMixer.displayMixerStatus();
        simpleMixer.displayMixerStatus();
        bluetoothMixer.displayMixerStatus();
        proMixer.displayMixerStatus();
    }
}