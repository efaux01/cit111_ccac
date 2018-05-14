/**
 * 
 */
package airportSimulation;

/**
 *
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
    
    public void PlaneType(PlaneModel planeType){
        this.planeModel = planeType;
    }//close setPlaneSize;
    
    public void takeoff(Runway assignedRunway){
        if(status=="In Flight"){
            System.out.println("Flight " + name + " is already in the air and "
                    + "cannot take off again. Try a different command");
        }else{
            System.out.println("Flight " + name + " to " + destination + " is "
                    + "taking off on runway " + assignedRunway.name);

            this.status = "Departed";
        }
    }//close takeoff
    
    public void land(Runway assignedRunway){
        if(status == "Landed" || status == "At Gate"){
            System.out.println("Flight " + name + " is already on the ground and"
                    + "cannot land again. Try a different command");
        }else{
            System.out.println("Flight " + name + " from " + origin + " is "
                    + "landing on runway " + assignedRunway.name);
            this.status = "Landed";
        }
    }//close land
    
    public void parkAtTerminal(){
        if(status == "Landed"){
            System.out.println("Flight " + name + " from " + origin + " is now "
                    + " parked at the gate.");
            this.status = "At Gate";
        }else if (status == "In Flight"){
            System.out.println("Flight " + name + " is still in the air. It "
                    + "must land first. Try a different command");
        }
    }      
}

