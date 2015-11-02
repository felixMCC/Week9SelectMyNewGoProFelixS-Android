package com.example;

/**
 * Created by Felix on 11/1/15.
 *
 * Houses the info for the Hero4 Silver model
 */
public class Hero4Silver extends GoPro{

    //default constructor
    Hero4Silver(){
        //set camera details
        this.setName("Hero4 Silver");
        this.setPrice("$399.99");
        this.setFieldOfView("Ultra Wide, Medium, Narrow");
        this.setOpticsLens("Ultra-sharp image quality / Ultra-wide angle all-glass lens with reduced distortion ");
        this.setLowLightPerformance("Professional grade");
        this.setVideo4K("15, 12.5fps\nUltra WideFOV");
        this.setVideo1080P("60, 50, 48, 30, 25, 24 fps\nUltra Wide, Medium, Narrow FOV");
        this.setMegapixels("12MP");
        this.setWireless("Wi-Fi + Bluetooth");
        this.setTimeLapse("Supported");
        this.setStudioMicrophone("No");
        this.setTouchDisplay("Supported");
        this.setPorts("Micro HDMI, mini USB, microSD, HERO Port, Composite A/V (via adapter, sold separately), 3.5mm Stereo Mic (via adapter, sold separately)");

        //set bundle features
        String[] bundleArray = {"HERO4 Silver", "3-Way", "Rechargeable Battery", "Floaty BackDoor", "SanDisk Extreme 32GB microSDHC"};
        this.setBundleArray1(bundleArray); //pass by reference

    }
    //generic method to print camera info
    public void printInfo(){
        super.printBundle(this.bundleArray1);
        super.printCameraDetails();

    }
}
