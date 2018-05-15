/*
 * A program demonstrating object creation and interaction using a 
 * simplified version what happens on an airport tarmac
 */
package airportSimulation;

/**
 *Blueprint for an Airplane Object
 * @author eliza
 */
public class Airplane {
    public String name;
    public String airline;
    public String status;
    public String arrivalTime;
    public String departureTime;
    public String origin;
    public String destination;
    public PlaneModel planeModel;
    public Gate assignedGate;
    public Runway assignedRunway;
    public String nameSpace;
    
    /**
     * Causes the Airplane to take off & change its status
     * @param assignedRunway - Runway the Airplane is going to takeoff from
     */
    public void takeoff(Runway assignedRunway){
        if(status=="In Flight"){
            System.out.println("Flight " + name + " is already in the air and "
                    + "cannot take off again. Try a different command");
        }else{
            System.out.println("Flight " + name + " to " + destination + " is "
                    + "taking off on runway " + assignedRunway.name);

            this.status = "Departed";
        }//close if/else
    }//close takeoff
    
    /**
     * Causes the Airplane to land & change its status
     * @param assignedRunway  - Runway the Airplane is going to land on
     */
    
    public void land(Runway assignedRunway){
        if(status == "Landed" || status == "At Gate"){
            System.out.println("Flight " + name + " is already on the ground and"
                    + "cannot land again. Try a different command");
        }else{
            System.out.println("Flight " + name + " is landing on runway " + 
                    assignedRunway.name);
            this.status = "Landed";
        }//close if/else
    }//close land
    
    /**
     * Moves the Airplane to park at a Gate at the terminal
     * @param assignedGate  - Gate the Airplane is assigned to park at
     */
    public void parkAtTerminal(Gate assignedGate){
        if(status == "Landed"){
            System.out.println("Flight " + name + " from " + origin + " is now "
                    + " parked at Gate " + assignedGate +".");
            this.status = "At Gate/Boarding";
        }else if (status == "In Flight"){
            System.out.println("Flight " + name + " is in the air. It "
                    + "must land first. Try a different command");
        }//close if/else
    }//close parkAtTerminal
}//close Airplane

