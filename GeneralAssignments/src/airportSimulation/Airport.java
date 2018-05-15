/*
 * A program demonstrating object creation and interaction using a 
 * simplified version what happens on an airport tarmac
 */
package airportSimulation;
    import java.util.Scanner;

/**
 *
 * @author eliza
 */
public class Airport {
    public static Airplane jetBlue4647;
    public static Airplane jetBlue1285;
    public static Airplane delta3481;
    public static Airplane delta2161;
    public static Airplane delta4176;
    public static Airplane delta4028;
    public static Airplane delta3985;
    public static Airplane amAir4092;
    public static Airplane amAir5231;    
    public static Airplane amAir1904;
    
    public static PlaneModel airBusA320;
    public static PlaneModel bombCRJ;
    public static PlaneModel airBusA330;
    
    public static Runway runwayA;
    public static Runway runwayB;
    public static Runway runwayC;
    
    public static Gate gateB44;
    public static Gate gateB46;
    public static Gate gateB51;
    public static Gate gateD76;
    public static Gate gateD79;
    public static Gate gateE04;
    public static Gate gateE05;
    public static Gate gateE07;
    
    public static int numPlanesProcess = 1;
    
    /**
     * Main method
     * @param args 
     */
    public static void main(String args[]){
        System.out.println("Welcome to Pittsburgh International Airport!");
                
        createGates();
        createPlaneModels();
        createRunways();
        createAirplanes();
        menu();
    }//close main
    
    /**
     * creates PlaneModel objects & sets variables
     */
    public static void createPlaneModels(){
        bombCRJ = new PlaneModel();
        bombCRJ.planeSize = 1;
        bombCRJ.numberOfSeats = 75;
        bombCRJ.numFlightAttendants = 2;
        
        airBusA320 = new PlaneModel();
        airBusA320.planeSize = 2;
        airBusA320.numberOfSeats = 150;
        airBusA320.numFlightAttendants = 4;
        airBusA320.planeType = "Airbus A320-320";
        
        airBusA330 = new PlaneModel();
        airBusA330.planeSize = 3;
        airBusA330.numberOfSeats = 290;
        airBusA330.numFlightAttendants = 7;
        airBusA330.planeType = "Airbus A330-300";
    }//close createPlaneModels
    
    
    /**
     * creates Airplane objects & sets variables
     */
    public static void createAirplanes(){
        jetBlue4647 = new Airplane();
        jetBlue4647.name = "4647";
        jetBlue4647.airline = "Jet Blue";
        jetBlue4647.planeModel = airBusA320;
        jetBlue4647.status = "In Flight";
        jetBlue4647.arrivalTime ="6:12";
        jetBlue4647.departureTime = "7:09";
        jetBlue4647.origin = "Chicago";
        jetBlue4647.destination = "Chicago";
        jetBlue4647.nameSpace = "    ";
        jetBlue4647.assignedGate = gateB51;
        
        jetBlue1285 = new Airplane();
        jetBlue1285.name = "1285";
        jetBlue1285.airline = "Jet Blue";
        jetBlue1285.planeModel = bombCRJ;
        jetBlue1285.status = "Boarding";
        jetBlue1285.departureTime = "6:19";
        jetBlue1285.destination = "Philadelphia";
        jetBlue1285.nameSpace = "";
        jetBlue1285.assignedGate = gateE05;
        
        delta3481 = new Airplane();
        delta3481.name = "3481";
        delta3481.airline = "Delta";
        delta3481.planeModel = airBusA320;
        delta3481.status = "On Time";
        delta3481.arrivalTime = "6:24";
        delta3481.departureTime = "7:13";
        delta3481.origin = "Houston";
        delta3481.destination = "Orlando";
        delta3481.assignedGate = gateB46;
        delta3481.nameSpace = "    ";
        
        delta2161 = new Airplane();
        delta2161.name = "2161";
        delta2161.airline = "Delta";
        delta2161.planeModel = airBusA320;
        delta2161.status = "On Time";
        delta2161.arrivalTime = "6:51";
        delta2161.departureTime = "7:31";
        delta2161.origin = "Nashville";
        delta2161.destination = "Charlotte";
        delta2161.assignedGate = gateB44;
        delta2161.nameSpace = "";
        
        delta4176 = new Airplane();
        delta4176.name = "4176";
        delta4176.airline = "Delta";
        delta4176.planeModel = airBusA330;
        delta4176.status = "At Gate";
        delta4176.departureTime = "6:32";
        delta4176.destination = "Los Angeles";
        delta4176.assignedGate = gateD76;
        delta4176.nameSpace = "";
                
        delta4028 = new Airplane();
        delta4028.name = "4028";
        delta4028.airline = "Delta";
        delta4028.planeModel = bombCRJ;
        delta4028.status = "Delayed ";
        delta4028.arrivalTime = "6:45";
        delta4028.departureTime = "7:40";
        delta4028.origin = "Baltimore";
        delta4028.destination = "Columbus";
        delta4028.assignedGate = gateE07;
        delta4028.nameSpace = "";
        
        amAir4092 = new Airplane();
        amAir4092.name = "4092";
        amAir4092.airline = "American Airlines";
        amAir4092.planeModel = bombCRJ;
        amAir4092.status = "Delayed";
        amAir4092.arrivalTime = "6:39";
        amAir4092.departureTime = "7:25";
        amAir4092.origin = "Trenton";
        amAir4092.destination = "Erie";
        amAir4092.assignedGate = gateE04;
        amAir4092.nameSpace = "    ";
        
        amAir5231 = new Airplane();
        amAir5231.name = "5231";
        amAir5231.airline = "American Airlines";
        amAir5231.planeModel = airBusA330;
        amAir5231.status = "Boarding";
        amAir5231.departureTime = "6:02";
        amAir5231.destination = "Seattle";
        amAir5231.assignedGate = gateD79;
        amAir5231.nameSpace = "    ";
        
        amAir1904 = new Airplane();
        amAir1904.name = "1904";
        amAir1904.airline = "American Airlines";
        amAir1904.planeModel = airBusA320;
        amAir1904.status = "On Time";
        amAir1904.arrivalTime = "6:54";
        amAir1904.departureTime = "7:45";
        amAir1904.origin = "New York";
        amAir1904.destination = "New York";
        amAir1904.assignedGate = gateD79;
        amAir1904.nameSpace = "";
        
        gateD76.dockedAirplane = delta4176;
        gateD79.dockedAirplane = amAir5231;
        gateE05.dockedAirplane = jetBlue1285;
    }//close createAirplanes
    
    /**
     * Creates Gate objects & sets their variables
     */
    public static void createGates(){
        gateB44 = new Gate();
        gateB44.name = "B44";
        gateB44.isOccupied = false;
        gateB44.airline = "Delta";
        gateB44.sizeSupported = 2;
        
        gateB46 = new Gate();
        gateB46.name = "B46";
        gateB46.isOccupied = false;
        gateB46.airline = "Delta";
        gateB46.sizeSupported = 2;
        
        gateB51 = new Gate();
        gateB51.name = "B51";
        gateB51.isOccupied = false;
        gateB51.airline = "Jet Blue";
        gateB51.sizeSupported = 2;
        
        gateD76 = new Gate();
        gateD76.name = "D76";
        gateD76.isOccupied = true;
        gateD76.airline = "Delta";
        gateD76.sizeSupported = 3;
        
        
        gateD79 = new Gate();
        gateD79.name = "D79";
        gateD79.isOccupied = true;
        gateD79.airline = "American Airlines";
        gateD79.sizeSupported = 3;
        
        
        gateE04 = new Gate();
        gateE04.name = "E04";
        gateE04.isOccupied = false;
        gateE04.airline = "American Airlines";
        gateE04.sizeSupported = 1;
        
        gateE05 = new Gate();
        gateE05.name = "E05";
        gateE05.isOccupied = true;
        gateE05.airline = "Jet Blue";
        gateE05.sizeSupported = 1;
        
        gateE07 = new Gate();
        gateE07.name = "E07";
        gateE07.isOccupied = false;
        gateE07.airline = "Delta";
        gateE07.sizeSupported = 1;
        
    }//close createGates
    
    /**
     * creates Runway objects & sets their variables
     */
    public static void createRunways(){
        runwayA = new Runway();
        runwayA.name = "A";
        runwayA.sizeSupported = 3;
        
        runwayB = new Runway();
        runwayB.name = "B";
        runwayB.sizeSupported = 2;
        
        runwayC = new Runway();
        runwayC.name = "C";
        runwayC.sizeSupported = 1;
    }//close createRunways
    
    
    /**
     * menu for user to choose arrival or departure board
     */
    public static void menu(){
        
        System.out.println("\nWhat would you like to do? \n1.View Arrivals "
                + "Board \n2.View Departures Board \n3.Go to Air Traffic "
                + "Control \n4.Exit Program");
        
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
           
        switch(choice){
            case 1:
                arrivalsBoard();
                break;
            case 2:
                departuresBoard();
                break;
            case 3:
                controlMenu();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Invalid Entry, Please Try Again!");
                menu();
        }//close switch
    }//close menu
    
    
    /**
     * menu for the Air Traffic Control portion of the program
     */
    public static void controlMenu(){
        int decide = 0;
        System.out.println("***********************************************");
        System.out.println("Welcome to the Air Traffic Control Tower! What "
                + "would you like to do?");
        System.out.println("1.Process Next Airplane \n2.View Runway Status "
                + "\n3.View Gate Status \n4.Return to Main Menu \n5.Exit "
                + "Program");
        
        Scanner scan = new Scanner(System.in);
        decide = scan.nextInt();
        
        switch(decide){
            case 1:
                airplaneProcessingMenu();
                break;
            case 2:
                runwayStatus();
                break;
            case 3:
                gateStatus();
                break;
            case 4:
                menu();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Invalid Entry, Please Try Again!");
                controlMenu();
        }//close switch
    }//close controlMenu
    
    /**
     * displays the arrival Board
     */
    public static void arrivalsBoard(){
        System.out.println("***********************Arrivals******************"
                + "*****\nAirline\t\t\tFlight\tCity\t\tTime\tGate\tStatus");
        arrivalPrint(jetBlue4647);
        arrivalPrint(delta3481);
        arrivalPrint(amAir4092);
        arrivalPrint(delta4028);
        arrivalPrint(delta2161);
        arrivalPrint(amAir1904);
        menu();
    }//close arrivalsBoard
    
    /**
     * prints arrival information for a single Airplane 
     * @param displaying - Airplane whose information is going to be displayed 
     */
    public static void arrivalPrint(Airplane displaying){
        if(displaying.airline == "American Airlines"){
            System.out.println(displaying.airline + "\t" + displaying.name + 
                 "\t" + displaying.origin + displaying.nameSpace  +"\t" + 
                displaying.arrivalTime + "\t" + displaying.assignedGate.name 
                + "\t" + displaying.status);
        }else if(displaying.airline == "Jet Blue"){
        
            System.out.println(displaying.airline + "\t\t" + displaying.name + 
                "\t" + displaying.origin + displaying.nameSpace +  "\t" + 
                displaying.arrivalTime + "\t" + displaying.assignedGate.name 
                + "\t" + displaying.status);
        }else{
            System.out.println(displaying.airline + "\t\t\t" + displaying.name 
                + "\t" + displaying.origin + displaying.nameSpace + "\t" + 
                displaying.arrivalTime + "\t" + displaying.assignedGate.name 
                + "\t" + displaying.status);
        }//close if/else
    }//close arrivalPrint
    
    /**
     * displays the departure Board
     */
    public static void departuresBoard(){
        System.out.println("*******************Departures********************"
                + "\nAirline\t\t\tFlight\tCity\t\tTime\tGate\tStatus");
        departuresPrint(amAir5231);
        departuresPrint(jetBlue1285);
        departuresPrint(delta4176);
        departuresPrint(jetBlue4647);
        departuresPrint(delta3481);
        departuresPrint(amAir4092);
        departuresPrint(delta2161);
        departuresPrint(delta4028);
        departuresPrint(amAir1904);
        menu();
    }//close departureBoard
    
    /**
     * prints departure information for a single Airplane
     * @param displaying - Airplane whose information is being displayed 
     */
    public static void departuresPrint(Airplane displaying){
        if(displaying.airline == "American Airlines"){
            System.out.println(displaying.airline + "\t" + displaying.name + 
                "\t" + displaying.destination + displaying.nameSpace + "\t" + 
                displaying.departureTime + "\t"  + displaying.assignedGate.name 
                + "\t" + displaying.status);
        }else if(displaying.airline == "Jet Blue"){
        
            System.out.println(displaying.airline + "\t\t" + displaying.name + 
                "\t" + displaying.destination + displaying.nameSpace + "\t" + 
                displaying.departureTime + "\t"  + displaying.assignedGate.name 
                + "\t" + displaying.status);
        }else{
            System.out.println(displaying.airline + "\t\t\t" + displaying.name 
                 + "\t" + displaying.destination + displaying.nameSpace+ "\t" + 
                displaying.departureTime + "\t"  + displaying.assignedGate.name 
                + "\t" + displaying.status);
        }//Close if/else
        
    }//close departuresPrint
    
    /**
     * displays the runway status board
     */
    public static void runwayStatus(){ 
        System.out.println("***********************************************");
        System.out.println("Name\tSize\tLast Used");
        printRunwayStatus(runwayA);
        printRunwayStatus(runwayB);
        printRunwayStatus(runwayC);
        controlMenu();
    }//close runwayStatus
    
    /**
     * prints status information for one Runway object
     * @param runwayPrinting - Runway whose status will be printed
     */
    public static void printRunwayStatus(Runway runwayPrinting){
        System.out.println(runwayPrinting.name + "\t" + 
                runwayPrinting.sizeSupported + "\t" + 
                runwayPrinting.getTimeUsed());
    }//close printRunwayStatus
    
    /**
     * displays the gate status board
     */
    public static void gateStatus(){
        System.out.println("***********************************************");
        System.out.println("Gate\tSize\tOccupied\tFlight #\tAirline");
        printGateStats(gateB44);
        printGateStats(gateB46);
        printGateStats(gateB51);
        printGateStats(gateD76);
        printGateStats(gateD79);
        printGateStats(gateE04);
        printGateStats(gateE05);
        printGateStats(gateE07);
        controlMenu();
    }//close gateStatus
    
    /**
     * prints status information for one Gate object
     * @param gatePrinting - Gate whose status will be printed
     */
    public static void printGateStats(Gate gatePrinting){
        if(gatePrinting.isOccupied == false){
            System.out.println(gatePrinting.name + "\t" + 
                gatePrinting.sizeSupported + "\t" + gatePrinting.isOccupied + 
                "\t\tN/A" + "\t\t" + gatePrinting.airline);
        }else{
            System.out.println(gatePrinting.name + "\t" + 
                gatePrinting.sizeSupported + "\t" + gatePrinting.isOccupied + 
                "\t\t" + gatePrinting.dockedAirplane.name+ "\t\t" + 
                gatePrinting.airline);
    
        }//close if/else
    }//close printGateStatus
    
    /**
     * Menu that decides which Airplane will attempt to land or take off. Never
     * seen by the user
     */
     public static void airplaneProcessingMenu(){
        switch(numPlanesProcess){
            case 1:
                flightDirector(amAir5231,runwayA);
                break;
            case 2:
                flightDirector(jetBlue4647,runwayB);
                break;
            case 3:
                flightDirector(jetBlue1285,runwayC);
                break;
            case 4:
                flightDirector(delta3481,runwayB);
                break;
            case 5:
                flightDirector(delta4176,runwayA);
                break;
            case 6:
                flightDirector(amAir4092,runwayB);
                break;
            case 7:
                flightDirector(delta4028,runwayC);
                break;
            case 8:
                flightDirector(delta2161,runwayB);
                break;
            case 9:
                flightDirector(amAir1904,runwayA);
                break;
            case 10:
                flightDirector(jetBlue4647,runwayB);
                break;
            case 11:
                flightDirector(delta3481,runwayA);
                break;
            case 12:
                flightDirector(amAir4092,runwayC);
                break;
            case 13:
                flightDirector(delta2161,runwayB);
                break;
            case 14:
                flightDirector(delta4028,runwayC);
                break;
            case 15:
                flightDirector(amAir1904,runwayA);
                break;
        }//close switch
    }//Close airplaneProcessingMenu
    
    /**
     * directs the chosen Airplane to take off, land, or park at a Gate 
     * depending on its current status
     * @param movingPlane - Airplane that is going to change status
     * @param runwayToUse  - Runway where the Airplane will change status
     */
    public static void flightDirector(Airplane movingPlane,Runway runwayToUse){
        int answer;
        System.out.println("***********************************************");
        if(movingPlane.status =="In Flight"){
            System.out.println("The time is now " + movingPlane.arrivalTime + 
                    ". " + movingPlane.airline + " Flight " + movingPlane.name 
                    + " from " + movingPlane.origin + " is \nrequesting to land "
                    + "on Runway " + runwayToUse.name + "Are they allowed to "
                            + "land?");
            answer = getYesNo();
            if(answer == 1){
                movingPlane.land(runwayToUse);
                runwayToUse.lastPlaneUsed = movingPlane;
                flightDirector(movingPlane,runwayToUse);
            }else{
                System.out.println("Alright, the airplane will make a circle "
                + "arround the airport and try again in a few minutes.");
            }//Close if/else
            
        }else if(movingPlane.status =="Landed"){
            System.out.println("Flight " + movingPlane.name + " would like to "
                    + "move to their previously assigned Gate " + 
                    movingPlane.assignedGate + "Can they proceed to the "
                    + "assigned gate?");
            answer = getYesNo();
            if(answer == 1){
                movingPlane.parkAtTerminal(movingPlane.assignedGate);
                numPlanesProcess++;
                movingPlane.assignedGate.isOccupied = true;
                movingPlane.assignedGate.dockedAirplane = movingPlane;
            }else {
                System.out.println("Ok, the airplane will just wait on the "
                    + "tarmac for a few minutes");
            }//close if/else
            
        }else{
            System.out.println("The time is now " + movingPlane.departureTime 
                + ". " + movingPlane.airline + " Flight " + movingPlane.name + 
                " to " + movingPlane.destination + " is " + "\nrequesting "
                + "permission" + " to take off on Runway " + runwayToUse.name 
                + " Are they allowed to takeoff?");
            answer = getYesNo();
            if(answer == 1){
                movingPlane.takeoff(runwayToUse);
                runwayToUse.lastPlaneUsed = movingPlane;
                numPlanesProcess++;
                movingPlane.assignedGate.isOccupied = false;
                movingPlane.assignedGate.dockedAirplane = null;
            }else{
                System.out.println("Ok, the airplane will stay at the gate "
                        + "a bit longer.");
            }//Close if/else
        }//close if/else
        controlMenu();
    }//close flightDirector
    
    /**
     * gets a string from the user. Only allows y for Yes or n for No
     * @return answer String of "y" or "n"
     */
    public static int getYesNo(){
        int answer = 4;
        Scanner type = new Scanner(System.in);
        if (answer != 1 && answer != 2){
            System.out.println("Type 1 for Yes and 2 for No");
            answer = type.nextInt();
        }//close if
       return answer; 
    }//close getYesNo
    
}//close Airport
 
