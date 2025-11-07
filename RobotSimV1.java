public class RobotSim {
    
    public static int batteryLevel = 103;           // Battery starts at 100%
    public static double distanceTraveled = -2.0;    // Distance in feet
    public static int gamePiecesCollected = 0;      // Number of game pieces
//    public static String robotState = "IDLE";       // Current state
    public static int matchTime = 15;               // 15 second autonomous period

    
    public static void main(String[] args) {
        System.out.println("=== Robot Simulation Started ===");
        System.out.println();
        

        for (int second = 0; second <= 15; second++) {
            batteryLevel = batteryLevel- 3;
            System.out.println("Time: " + second + "s" + " "+ batteryLevel+ "%");
            // Your simulation logic here
            distanceTraveled = distanceTraveled +2;
            System.out.println("Distance Traveled = " + distanceTraveled );
            System.out.println("Mode = Autonomous");
            System.out.println();
        }
        // TODO: Initialize your variables here
        
        
        // TODO: Create a simulation loop
        // Ideas:
        // - Use a for loop to simulate time passing (e.g., for 15 seconds)
        // - Print updates each "second" showing what the robot is doing
        // - Change variables over time (battery drains, distance increases, etc.)
        // - Add if statements to make decisions (e.g., if battery < 20, print warning)
        
        // Example structure:
        // for (int second = 0; second <= 15; second++) {
        //     System.out.println("Time: " + second + "s");
        //     // Your simulation logic here
        //     System.out.println();
        // }
        
        System.out.println("=== Simulation Complete ===");
        
        // TODO: Print final statistics
        // Examples: Total distance traveled, final battery level, game pieces scored, etc.
    }
}