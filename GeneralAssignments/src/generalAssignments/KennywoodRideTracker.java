/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generalAssignments;
    import java.util.Random;
/**
 *
 * @author efaux01
 */
public class KennywoodRideTracker {
    static int totalRiders = 0;
    static int totalFailedRideAttempts = 0;
    static int totalSickRiders = 0;
    static int riders;
    static int avgHeight;
    static final int MINIMUM_THRILL_HEIGHT = 60;
    static final int MINIMUM_THEME_HEIGHT = 48;
    static final int MAXIMUM_RIDERS = 12;
    static final int MAXIMUM_HEIGHT = 75;
    
    public static void main(String args[]){
        rideBlackWidow();
        rideMerryGoRound();
        rideBlackWidow();
        rideMerryGoRound();
        rideMerryGoRound();
        rideBlackWidow();
    }//close main
    
    public static void setRiders(){
        riders = numGenerator(MAXIMUM_RIDERS);
        avgHeight = numGenerator(MAXIMUM_HEIGHT);
    }//close setRiders
    
    public static void rideBlackWidow(){
        setRiders();
        int sickRiders;
        
        System.out.println("Riding Black Widow");
        if(avgHeight<=MINIMUM_THRILL_HEIGHT){
            System.out.println("Aw. Too bad. " + riders + " were too short and couldn't ride");
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
        }else{
            totalRiders=totalRiders+riders;
            sickRiders = numGenerator(riders);
            totalSickRiders = totalSickRiders+sickRiders;
        }
        printRideStats();
    }//close rideBlackWidow
    
    public static void rideMerryGoRound(){
        setRiders();
        int sickRiders;
        
        System.out.println("Riding Merry-Go-Round");
        if(avgHeight<=MINIMUM_THEME_HEIGHT){
            System.out.println("Aw. Too bad. " + riders + " were too short and couldn't ride");
            totalFailedRideAttempts = totalFailedRideAttempts + riders;
        }else{
            totalRiders=totalRiders+riders;
            sickRiders = numGenerator(riders);
            totalSickRiders = totalSickRiders+sickRiders;
        }
        printRideStats();
    }//close rideMerryGoRound
    
    public static void printRideStats(){
        System.out.println("*******RIDER STATS*******");
        System.out.println("Total Riders: " + totalRiders);
        System.out.println("Total Failed Ride Attempts: " + totalFailedRideAttempts);
        System.out.println("Total Sick Riders: " + totalSickRiders);
        System.out.println("*************************");
    }//close printRideStats
    
    public static int numGenerator(int maximum){
        Random thing = new Random();
        int number = thing.nextInt(maximum);
        return number;
    }//close numGenerator
}
