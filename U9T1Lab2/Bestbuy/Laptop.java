package Bestbuy;
public class Laptop extends Computer {
    private boolean trackPadCalibrated;

    public Laptop(int screenSize, int memory) {
        super(screenSize, memory);
        trackPadCalibrated = false;
    }



    public boolean isTrackPadCalibrated() {
        return trackPadCalibrated;
    }

    @Override
    public void installOperatingSystem() {
        System.out.println("installing OS on my laptop…");
    }

    @Override
    public void printInfo(){
        System.out.println("Screen Size: "+ getScreenSize());
        System.out.println("Memory: "+getMemory());
        System.out.println("Track calibrated? "+isTrackPadCalibrated());
    }

    
    public void calibrateTrackpad() {
        if (!trackPadCalibrated) {
            trackPadCalibrated = true;
            System.out.println("Calibration complete!");
        } else {
            System.out.println("No need to calibrate");
        }
    }
}