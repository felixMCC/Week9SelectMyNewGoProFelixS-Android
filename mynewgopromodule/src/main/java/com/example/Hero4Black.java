package com.example;

/**
 * Created by Felix on 11/1/15.
 *
 * Houses the info for the Hero4 Black model
 */
public class Hero4Black extends GoPro {

    //default constructor
    Hero4Black(){
        //set camera details
        this.setName("Hero4 Black");
        this.setPrice("$499.99");
        this.setFieldOfView("Ultra Wide, Medium, Narrow");
        this.setOpticsLens("Ultra-sharp image quality / Ultra-wide angle all-glass lens with reduced distortion ");
        this.setLowLightPerformance("Professional grade");
        this.setVideo4K("30, 25, 24fps\nUltra WideFOV");
        this.setVideo1080P("120, 90, 60, 50, 48, 30, 25, 24 fps\nUltra Wide, Medium (excludes 120 and 90fps), Narrow FOV");
        this.setMegapixels("12MP");
        this.setWireless("Wi-Fi + Bluetooth");
        this.setTimeLapse("Supported");
        this.setStudioMicrophone("Supported");
        this.setTouchDisplay("No");
        this.setPorts("Micro HDMI, mini USB, microSD, HERO Port, Composite A/V (via adapter, sold separately), 3.5mm Stereo Mic (via adapter, sold separately)");

        //set bundle features
        String[] bundleArray = {"HERO4 Black", "3-Way", "The Strap (Hand + Wrist + Arm + Leg Mount)", "Dive Housing", "SanDisk Extreme 64GB microSDXC"};
        this.setBundleArray1(bundleArray); //pass by reference

    }
    //generic method to print camera info
    public void printInfo(){
        super.printBundle(this.bundleArray1);
        super.printCameraDetails();

    }

}
