package com.example;

import java.util.HashMap;

/**
 * Created by Felix on 11/1/15.
 */
public class GoPro {

    //class variables
    String name, price, fieldOfView, opticsLens, lowLightPerformance, video4K, video1080P, megapixels, wireless;
    String timeLapse, studioMicrophone, touchDisplay, ports;
    String [] bundleArray1; //class array holding camera bundle info
    //hashmap holding items that come bundled with camera
    //HashMap<String, String[]> bundleFeatures = new HashMap<String, String[]>();

    //getter methods

    //gets name of camera
    protected String getName(){
        return name;
    }

    //get price of camera
    protected String getPrice(){
        return price;
    }

    protected String getFieldOfView(){
        return fieldOfView;
    }

    protected String getOpticsLens(){
        return opticsLens;
    }

    protected String getLowLightPerformance(){
        return lowLightPerformance;
    }

    protected String getVideo4K(){
        return video4K;
    }

    protected String getVideo1080P(){
        return video1080P;
    }

    protected String getMegapixels(){
        return megapixels;
    }

    protected String getWireless(){
        return wireless;
    }

    protected String getTimeLapse(){
        return timeLapse;
    }

    protected String getStudioMicrophone(){
        return studioMicrophone;
    }

    protected String getTouchDisplay(){
        return touchDisplay;
    }

    protected String getPorts(){
        return ports;
    }

    //setter methods

    //sets price for camera
    protected void setPrice(String p){
        price = p;
    }
    //sets name for camera
    protected void setName(String called){
        name = called;
    }
    //sets field of vie for camera
    protected void setFieldOfView(String view){
        fieldOfView = view;
    }
    //sets optics & lenses for camera
    protected void setOpticsLens(String optics){
        opticsLens = optics;
    }
    //set low light performance for camera
    protected void setLowLightPerformance(String lowLight){
        lowLightPerformance = lowLight;
    }
    //set 4k video abilities
    protected void setVideo4K(String v4k){
        video4K = v4k;
    }
    //set 1080p video abilities
    protected void setVideo1080P(String v1080P){
        video1080P = v1080P;
    }
    //set megapixels for camera
    protected void setMegapixels(String pixels){
        megapixels = pixels;
    }
    //set wireless features for camera
    protected void setWireless(String wire){
        wireless = wire;
    }
    //set time lapse features for camera
    protected void setTimeLapse(String time){
        timeLapse = time;
    }
    //set external mic ability for camera
    protected void setStudioMicrophone(String mic){
        studioMicrophone = mic;
    }
    //set touch display capability
    protected void setTouchDisplay(String touch){
        touchDisplay = touch;
    }
    //set ports available for camera
    protected void setPorts(String p){
        ports = p;
    }
    //set bundle array
    protected void setBundleArray1(String[] arr){
        bundleArray1 = arr;
    }
    //methods

    //prints components of camera values
    protected void printBundle(){
        cameraPrintToUser("Contents of " + this.getName() + " bundle: ");
        //iterate through array
        for(int cnt = 0; cnt < bundleArray1.length; cnt++){
            cameraPrintToUser("\t- " + bundleArray1[cnt]);
        }
    }

    //prints components of camera values
    protected void printBundle(String[] array){
        cameraPrintToUser("Contents of " + this.getName() + " bundle: ");
        //iterate through array
        for(int cnt = 0; cnt < array.length; cnt++){
            cameraPrintToUser("\t- " + array[cnt]);
        }
    }

    //prints camera details
    protected void printCameraDetails(){
        cameraPrintToUser("\nCamera Details for the " + this.getName() + ":");
        cameraPrintToUser("Total Price: " + this.getPrice() + "\n");
        cameraPrintToUser("\nImage Quality");
        cameraPrintToUser("\tField of View (FOV): " + this.getFieldOfView());
        cameraPrintToUser("\tOptics + Lens: " + this.getOpticsLens());
        cameraPrintToUser("\tLow-light Performance: " + this.getLowLightPerformance());
        cameraPrintToUser("\nVideo Features");
        cameraPrintToUser("\t4K: \t" + this.getVideo4K());
        cameraPrintToUser("\t1080P: \t" + this.getVideo1080P());
        cameraPrintToUser("\nPhoto Features");
        cameraPrintToUser("\tMegapixels: " + this.getMegapixels());
        cameraPrintToUser("\nAdvanced Features");
        cameraPrintToUser("\tBuilt-in Wireless: " + this.getWireless());
        cameraPrintToUser("\tTime Lapse Video: " + this.getTimeLapse());
        cameraPrintToUser("\nAudio Features");
        cameraPrintToUser("\tStudio Quality External Mic: " + this.getStudioMicrophone());
        cameraPrintToUser("\nUsability Features");
        cameraPrintToUser("\tBuilt-in Touch Display: " + this.getTouchDisplay());
        cameraPrintToUser("\tPorts:" + this.getPorts());
    }
    /*
    protected void printBundle(){
        //loop for iterating through hashmap
        for (HashMap.Entry<String, String[]> entry : bundleFeatures.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            // ...
        }
    }*/

    //prints message to user
    protected void cameraPrintToUser(String message){
        System.out.println(message);
    }

}
