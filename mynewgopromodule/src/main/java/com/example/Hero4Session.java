package com.example;

/**
 * Created by Felix on 11/1/15.
 *
 * Houses the info for the Hero4 Session Model
 */
public class Hero4Session extends GoPro{


    //default constructor
    Hero4Session(){
        //set camera details
        this.setName("Hero4 Session");
        this.setPrice("$299.99");
        this.setFieldOfView("Ultra Wide, Medium");
        this.setOpticsLens("Ultra-wide angle glass lens with reduced distortion");
        this.setLowLightPerformance("Consumer grade");
        this.setVideo4K("N/A");
        this.setVideo1080P("60, 50, 30, 25 fps\nUltra Wide, Medium, Narrow FOV");
        this.setMegapixels("8MP");
        this.setWireless("Wi-Fi + Bluetooth");
        this.setTimeLapse("No");
        this.setStudioMicrophone("No");
        this.setTouchDisplay("No");
        this.setPorts("Micro USB, microSD");

        //set bundle features
        String[] bundleArray = {"HERO4 Session", "The Strap (Hand + Wrist + Arm + Leg Mount)", "Chest harness", "Smart Remote", "SanDisk Extreme 32GB microSDHC"};
        this.setBundleArray1(bundleArray); //pass by reference

    }
    //generic method to print camera info
    public void printInfo(){
        super.printBundle(this.bundleArray1);
        super.printCameraDetails();

    }
}
