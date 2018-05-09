/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airportInfoPannel;
import java.util.Scanner;
/**
 *
 * @author eliza
 */
public class AirplaneLand {
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

    public static void main(String args[]){
        createPlaneModels();
        setBasicPlaneInfo();
        setRunways();
        menu();
    }//close main
    
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
    }
    
    
    public static void setBasicPlaneInfo(){
        jetBlue4647 = new Airplane();
        jetBlue4647.name = "4647";
        jetBlue4647.airline = "Jet Blue";
        jetBlue4647.planeModel = airBusA320;
        jetBlue4647.status = "Arriving";
        
        jetBlue1285 = new Airplane();
        jetBlue1285.name = "1285";
        jetBlue1285.airline = "Jet Blue";
        jetBlue1285.planeModel = bombCRJ;
        jetBlue1285.status = "Boarding";
        
        delta3481 = new Airplane();
        delta3481.name = "3481";
        delta3481.airline = "Delta";
        delta3481.planeModel = airBusA320;
        delta3481.status = "On Time";
        
        delta2161 = new Airplane();
        delta2161.name = "2161";
        delta2161.airline = "Delta";
        delta2161.planeModel = airBusA320;
        delta2161.status = "On Time";
                
        delta4176 = new Airplane();
        delta4176.name = "4176";
        delta4176.airline = "Delta";
        delta4176.planeModel = airBusA330;
        delta4176.status = "At Gate";
                
        delta4028 = new Airplane();
        delta4028.name = "4028";
        delta4028.airline = "Delta";
        delta4028.planeModel = bombCRJ;
        delta4028.status = "Delayed ";
        
        amAir4092 = new Airplane();
        amAir4092.name = "4092";
        amAir4092.airline = "American Airlines";
        amAir4092.planeModel = bombCRJ;
        amAir4092.status = "Delayed";
        
        amAir5231 = new Airplane();
        amAir5231.name = "5231";
        amAir5231.airline = "American Airlines";
        amAir5231.planeModel = airBusA330;
        amAir5231.status = "Boarding";
        
        amAir1904 = new Airplane();
        amAir1904.name = "1904";
        amAir1904.airline = "American Airlines";
        amAir1904.planeModel = airBusA320;
        amAir1904.status = "On Time";
        
    }//close setBasicPlaneInfo
        
    public static void setRunways(){
        runwayA = new Runway();
        runwayA.name = "A";
        runwayA.sizeSupported = 1;
        
        runwayB = new Runway();
        runwayB.name = "B";
        runwayB.sizeSupported = 2;
        
        runwayC = new Runway();
        runwayC.name = "C";
        runwayC.sizeSupported = 3;
    }//close setRunways
    
    public static void menu(){
        int choice = 0;
        System.out.println("What would you like to view? \n1.Arrivals Board "
                + "\n2.Departures Board \n3.Exit Program");
        
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();
        while( choice !=1 && choice !=2 && choice !=3){
            System.out.println("Invalid Entry, please try again.");
            choice = scan.nextInt();
        }   
        switch(choice){
            case 1:
                arrivalsBoard();
                break;
            case 2:
                departuresBoard();
                break;
            case 3:
                System.exit(0);
        }
    }//close menu
    
    public static void arrivalsBoard(){
        System.out.println("***********************Arrivals***********************\n"
                + "Airline\t\t\tFlight\tCity\tTime\tStatus");
        arrivalPrint(jetBlue4647);
        arrivalPrint(delta3481);
        arrivalPrint(amAir4092);
        arrivalPrint(delta2161);
        arrivalPrint(delta4028);
        arrivalPrint(amAir1904);
        
    }
    public static void arrivalPrint(Airplane displaying){
        if(displaying.airline == "American Airlines"){
            System.out.println(displaying.airline + "\t" + displaying.name + "\t" 
                + displaying.origin + "\t" + displaying.arrivalTime + "\t" 
                + displaying.status);
        }else if(displaying.airline == "Jet Blue"){
        
            System.out.println(displaying.airline + "\t\t" + displaying.name + "\t" 
                + displaying.origin + "\t" + displaying.arrivalTime + "\t" 
                + displaying.status);
        }else{
            System.out.println(displaying.airline + "\t\t\t" + displaying.name + "\t" 
                + displaying.origin + "\t" + displaying.arrivalTime + "\t" 
                + displaying.status);
        }
    }
    public static void departuresBoard(){
        System.out.println("*******************Departures********************\n"
                + "Airline\t\t\tFlight\tCity\tTime\tStatus");
        departuresPrint(amAir5231);
        departuresPrint(jetBlue1285);
        departuresPrint(delta4176);
        departuresPrint(jetBlue4647);
        departuresPrint(delta3481);
        departuresPrint(amAir4092);
        departuresPrint(delta2161);
        departuresPrint(delta4028);
        departuresPrint(amAir1904);
    }
    
    public static void departuresPrint(Airplane displaying){
        if(displaying.airline == "American Airlines"){
            System.out.println(displaying.airline + "\t" + displaying.name + "\t" 
                + displaying.destination + "\t" + displaying.departureTime + "\t" 
                + displaying.status);
        }else if(displaying.airline == "Jet Blue"){
        
            System.out.println(displaying.airline + "\t\t" + displaying.name + "\t" 
                + displaying.destination + "\t" + displaying.departureTime + "\t" 
                + displaying.status);
        }else{
            System.out.println(displaying.airline + "\t\t\t" + displaying.name + "\t" 
                + displaying.destination + "\t" + displaying.departureTime + "\t" 
                + displaying.status);
        } 
        
    }
}//close AirplaneLand
