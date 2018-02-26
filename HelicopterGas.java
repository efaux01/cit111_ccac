/*
 * This program is to calculate if a Robinson R66 helicopter has enough  
 * gas for a 2 leg trip based on the longitude and latitude points of those
 * locations.
 */
package helicopterGas;
    import java.util.Scanner;
/**
 * 
 *
 * @author eliza
 */
public class HelicopterGas {
    
    private static double MPG;
    private static double gasInTank;
    private static double canTravel;
    private static double distanceLeft;
    private static double totalDistance;
    private static double gasToDestination;
    private static double gasRemainder;
    
    
    
    /**
     * main method
     * @param args complier entry point for input data
     */
    public static void main (String args []){
        double latA, lonA;
        double latB, lonB;
        double latC, lonC;
        
        String locationA;
        String locationB;
        String locationC;
                
        double distanceAB, distanceBC;
        double goFurther;
        
        final double MAX_GAS_CAPACITY = 73.6;
        final double GPH = 21.6;
        final double MPH = 134.64;
        boolean keepGoing = true;
        
        
        //Calculate avaerage Miles per gallon
        MPG = MPH/GPH;
        final double MAX_RANGE = MAX_GAS_CAPACITY * MPG;
        
        System.out.println("Welcome to the R66 Robinson Helicopter Gas "
                + "Distance Calculator!");
        System.out.println("********************* \nFor the purposes of this "
                + "program, enter latitude and longitude as decimals and \nuse a "
                + "negative sign to indicate south or east.");
        
        //collect variables for location A
        System.out.println("Please name the first location.");
        Scanner scanLocationA = new Scanner(System.in);
        locationA = scanLocationA.next();
        
        latA = getLatitude(locationA);
        lonA = getLongitude(locationA);
        
        //collect variables for location B
        System.out.println("Please name the second location.");
        Scanner scanLocationB = new Scanner(System.in);
        locationB = scanLocationB.next();
        
        latB = getLatitude(locationB);
        lonB = getLongitude(locationB);
        
        //collect variables for location C
        System.out.println("Please name the third location.");
        Scanner scanLocationC = new Scanner(System.in);
        locationC = scanLocationC.next();
        
        latC = getLatitude(locationC);
        lonC = getLongitude(locationC);
        
        //calculate the distance of AB
        distanceAB = calcRadianDistance(lonA, lonB, latA, latB);
         
        //calculate the distance of BC
        distanceBC = calcRadianDistance(lonB, lonC, latB, latC);
        
        totalDistance = distanceAB + distanceBC;

        //display distances for verification
        System.out.println("\nThe distance between " + locationA + " and " 
                + locationB + " is " + distanceAB + " miles.");
        System.out.println("The distance between " + locationB + " and " 
                + locationC + " is " + distanceBC + " miles.");
        
        
        
        //how much gas is in the tank
        while(keepGoing){
            System.out.println("How many gallons of gas do you have left?");
            Scanner scanGallons = new Scanner(System.in);
            gasInTank = scanGallons.nextDouble();
        
            if(gasInTank > MAX_GAS_CAPACITY) {
            System.out.println("Woah, Woah, Woah, you can't even fit that much "
                    + "gas in your Helicopter. An R66 only holds " + MAX_GAS_CAPACITY 
                    + " Try Again!");
            }//close if
            else if(gasInTank < 0){
            System.out.println("You can't have less than zero gas in your tank!"
                    + " Try Again!");
            }//close else if
            else{
                keepGoing = false;//end the loop
                
                //calculate how far the helicopter can go with the available gas
                canTravel = gasInTank * MPG;
                System.out.println("You can travel " + canTravel + " miles with " 
                        + gasInTank + " gallons of gas.");
                
                /*end sequence if distances are too far and the helicopter 
                can't get there with a full tank*/
                if (distanceAB > MAX_RANGE){
                    System.out.println("The distance between " + locationA + " and " 
                            + locationB + " is too far. Your helicopter can't "
                                    + "hold that much gas.");
                } 
                else if(distanceBC > MAX_RANGE){
                    System.out.println("The distance between " + locationB + " and " 
                            + locationC + " is to far. Your helicopter can't "
                            + "hold that much gas.");
                }
                //Message if you can't even get to first destination
                else if(canTravel < distanceAB){
                    System.out.println("\nYou can't even make it to " + locationB
                            + " with that much gas!");
                    didNotMakeIt();
                    
                }
                //message if you can ge to the first destination but not the second
                else if (canTravel > distanceAB && canTravel < totalDistance){
                System.out.println("\nWell you made it to " + locationB
                            + " but you can't quite get to " + locationC 
                        + " with that much gas.");
                    didNotMakeIt();
                   
                }
                //message if you will make it all the way
                else{
                    System.out.println("Wow, you do have enough gas! Congradulations.");
                    gasRemainder = canTravel-totalDistance;
                    goFurther = gasRemainder * MPG;
                    System.out.println("You have another " + gasRemainder 
                            + " gallons of gas left.");
                    System.out.println("You could go another " + goFurther + " miles.");
                    
                }//close final else 
            }//close first else
        }//Close while loop
       
        
        
        
        
        
    }//close main
    /**
     * get latitude from user 
     * @param name location name from main
     * @return latitude
     */
    public static double getLatitude(String name){
        System.out.println("Enter the latitude of " + name + ".");
        Scanner scanLat = new Scanner(System.in);
        double lat = scanLat.nextDouble();
        return lat;
    }//close getLatitude
    
    /**
     * get longitude from user
     * @param name location name from main
     * @return longitude
     */
    public static double getLongitude(String name){
        System.out.println("Now Enter the longitude of " + name + ".");
        Scanner scanLon = new Scanner(System.in);
        double lon = scanLon.nextDouble();
        return lon;
    }// close getLongitude
    
    /**
     * calculate distance based on variables from main
     * @param lon1  longitude of the first point
     * @param lon2 longitude of the second point
     * @param lat1 latitude of the first point
     * @param lat2 latitude of the second point
     * @return distance between two points
     */
    public static double calcRadianDistance(double lon1, double lon2, double lat1, 
            double lat2){
        double latTotal;
        double lonTotal;
        double a;
        double c;
        double distance;
        final double RADIUS_OF_EARTH =  3961.3;
                
        latTotal = Math.toRadians(lat2 - lat1);
        lonTotal = Math.toRadians(lon2-lon1);
        a = Math.sin(latTotal/2) * Math.sin(latTotal/2) + Math.cos(Math.toRadians(lat1)) 
                * Math.cos(Math.toRadians(lat2))*Math.sin(lonTotal/2) * Math.sin(lonTotal/2);
        c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        distance = RADIUS_OF_EARTH * c;
        return distance;
        
    }//close calcRadianDistance
    
    /**
     * sequence to be completed if the helicopter does not make it to the final destination
     */
    public static void didNotMakeIt(){
        
        distanceLeft = totalDistance - canTravel;
        
        
        gasToDestination = MPG/distanceLeft;
                    System.out.println("You need to go another " + distanceLeft 
                            + " miles.");
                    System.out.println("It would take another " + gasToDestination 
                            + " gallons of gas.");
        
    }//close calcRadianDistance
}//close class HelicopterGas
