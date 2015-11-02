package com.example;
import java.util.*;

/**
 * Created by Felix on 11/1/15.
 */
public class ChooseGoPro {
    Scanner in = new Scanner(System.in);
    //HashMap objects
    HashMap<String, GoPro> water = new HashMap<String, GoPro>();
    HashMap<String, GoPro> snow = new HashMap<String, GoPro>();
    HashMap<String, GoPro> action = new HashMap<String, GoPro>();

    /*
    //HashMap objects
    HashMap<String, String> water = new HashMap<String, String>();
    HashMap<String, String> snow = new HashMap<String, String>();
    HashMap<String, String> action = new HashMap<String, String>();
    */

    //main program loop
    public void runChooseMyGoPro(){
        //create camera objects
        Hero4Black hero4Black = new Hero4Black();
        Hero4Silver hero4Silver = new Hero4Silver();
        Hero4Session hero4Session = new Hero4Session();

        //initialize HashMap Data
        initializeHashMaps(hero4Black, hero4Silver, hero4Session);
        /*
        water.get("diving").printCameraDetails();
        */
        /* testing
        printToUser(hero4Black.getName());
        printToUser("info:\n");
        hero4Black.printInfo();
        */
        //main program loop
        do{
            printToUser("Welcome to Select My GoPro!\nPlease answer the following questions in order to select the perfect GoPro for you:\n");
            String tempActivity = promptActivity(); //ask user to select an activity type
            //depending on the choise, present the specific types of activities
            if(tempActivity.equalsIgnoreCase("water")){
                String tempWaterActivity = promptWaterActivity();
                water.get(tempWaterActivity).printBundle();
                water.get(tempWaterActivity).printCameraDetails();
            }else if(tempActivity.equalsIgnoreCase("snow")){
                String tempSnowActivity = promptSnowActivity();
                printToUser("returned from choosing snow: " + tempSnowActivity);
                snow.get(tempSnowActivity).printBundle();
                snow.get(tempSnowActivity).printCameraDetails();
            }else if(tempActivity.equalsIgnoreCase("action")){
                String tempActionActivity = promptActionActivity();
                action.get(tempActionActivity).printBundle();
                action.get(tempActionActivity).printCameraDetails();
            }else{
                printToUser("Incorrect entry. Please revise your answer.");
            }

        }while(checkYesNo());

    }

    //prompts user to pick a generic type of activity
    private String promptActivity(){
        printToUser("Please select the type of activity you will be participating in:\n1. Water sports/activities\n2. Snow sports/activities\n3. Action sports/General activities.");
        String temp = receiveInput();
        int choice = -1; //holds value from user
        String activity = "null";
        //change string input from user to integer value for switch operation
        try{
            choice = Integer.parseInt(temp);
        }catch(NumberFormatException e){
            printToUser("Invalid entry please try again");
            promptActivity();
        }
        //based on choice return the type of activity
        if(choice > 0 && choice < 4){
            switch(choice){
                case 1:
                    activity = "water";
                    break;
                case 2:
                    activity = "snow";
                    break;
                case 3:
                    activity = "action";
                    break;
                default:
                    printToUser("Invalid entry please try again");
                    promptActivity();
            }
        }else{
            printToUser("Invalid entry please try again");
            promptActivity();
        }
        return activity;
    }

    //prompts user to pick a specific type of activity
    private String promptWaterActivity(){
        printToUser("Please select the type of activity you will be participating in:\n1. Diving\n2. Surfing\n3. Snorkling");
        String temp = receiveInput();
        int choice = -1; //holds value from user
        String activity = "null";
        //change string input from user to integer value for switch operation
        try{
            choice = Integer.parseInt(temp);
        }catch(NumberFormatException e){
            printToUser("Invalid entry please try again");
            promptWaterActivity();
        }
        //based on choice return the type of activity
        if(choice > 0 && choice < 4){
            switch(choice){
                case 1:
                    activity = "diving";
                    break;
                case 2:
                    activity = "surfing";
                    break;
                case 3:
                    activity = "snorkeling";
                    break;
                default:
                    printToUser("Invalid entry please try again");
                    promptWaterActivity();
            }
        }else{
            printToUser("Invalid entry please try again");
            promptWaterActivity();
        }
        return activity;
    }

    //prompts user to pick a specific type of activity
    private String promptSnowActivity(){
        printToUser("Please select the type of activity you will be participating in:\n1. Snowmobileing\n2. Snowboarding\n3. Skiing");
        String temp = receiveInput();
        int choice = -1; //holds value from user
        String activity = "null";
        //change string input from user to integer value for switch operation
        try{
            choice = Integer.parseInt(temp);
        }catch(NumberFormatException e){
            printToUser("Invalid entry please try again");
            promptSnowActivity();
        }
        //based on choice return the type of activity
        if(choice > 0 && choice < 4){
            switch(choice){
                case 1:
                    activity = "snowmobile";
                    break;
                case 2:
                    activity = "snowboarding";
                    break;
                case 3:
                    activity = "skiing";
                    break;
                default:
                    printToUser("Invalid entry please try again");
                    promptSnowActivity();
            }
        }else{
            printToUser("Invalid entry please try again");
            promptSnowActivity();
        }
        return activity;
    }

    //prompts user to pick a specific type of activity
    private String promptActionActivity(){
        printToUser("Please select the type of activity you will be participating in:\n1. Skating\n2. Music activity\n3. General Family Activity\n4. Activities involving Pets\n5. Skydiving\n6.Rock Climbing\n7.Road Biking");
        String temp = receiveInput();
        int choice = -1; //holds value from user
        String activity = "null";
        //change string input from user to integer value for switch operation
        try{
            choice = Integer.parseInt(temp);
        }catch(NumberFormatException e){
            printToUser("Invalid entry please try again");
            promptActionActivity();
        }
        //based on choice return the type of activity
        if(choice > 0 && choice < 8){
            switch(choice){
                case 1:
                    activity = "skating";
                    break;
                case 2:
                    activity = "music";
                    break;
                case 3:
                    activity = "family";
                    break;
                case 4:
                    activity = "pets";
                    break;
                case 5:
                    activity = "skydiving";
                    break;
                case 6:
                    activity = "rock climbing";
                    break;
                case 7:
                    activity = "road bike";
                    break;
                default:
                    printToUser("Invalid entry please try again");
                    promptActionActivity();
            }
        }else{
            printToUser("Invalid entry please try again");
            promptActionActivity();
        }
        return activity;
    }

    //receives string and prints it out to the console
    private void printToUser(String message){
        System.out.println(message);
    }

    //receives input from user
    private String receiveInput(){
        String temp = in.nextLine();
        //printToUser("echo: " + temp); //testing
        return temp;
    }

    //receives user input and returns true if input is yes or false if input is no
    private Boolean checkYesNo(){
        printToUser("\nWould you like to choose another GoPro option?");
        String choice = receiveInput(); //receive input from console (user)
        //if user selects yes, return true, else return false
        if( choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("yes")){
            return true;
        }else{
            return false;
        }
    }

    //initializes HashMap data
    private void initializeHashMaps(Hero4Black hero4black, Hero4Silver hero4silver, Hero4Session hero4session){
        //initialize water-sports HashMap
        water.put("diving", hero4black);
        water.put("surfing",hero4black);
        water.put("snorkeling",hero4silver);

        //initialize snow-sports HashMap
        snow.put("snowmobile", hero4silver);
        snow.put("snowboarding",hero4silver);
        snow.put("skiing",hero4black);

        //initialize action HashMap
        action.put("skating",hero4black);
        action.put("music",hero4black);
        action.put("family",hero4silver);
        action.put("pets",hero4silver);
        action.put("skydiving",hero4session);
        action.put("rock climbing", hero4session);
        action.put("road bike",hero4session);
    }

    /*
    //initializes HashMap data
    private void initializeHashMaps(){
        //initialize water-sports HashMap
        water.put("diving", "hero4 black");
        water.put("surfing","hero4 black");
        water.put("snorkeling","hero4 silver");

        //initialize snow-sports HashMap
        snow.put("snowmobile", "hero4 silver");
        snow.put("snowboarding","hero4 silver");
        snow.put("skiing","hero4 black");

        //initialize action HashMap
        action.put("skating","hero4 black");
        action.put("music","hero4 black");
        action.put("family","hero4 silver");
        action.put("pets","hero4 silver");
        action.put("skydiving","hero4 session");
        action.put("rock climbing","hero4 session");
        action.put("road bike","hero4 session");
    }*/
}
