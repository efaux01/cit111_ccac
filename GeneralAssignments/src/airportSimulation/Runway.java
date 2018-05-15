/*
 * A program demonstrating object creation and interaction using a 
 * simplified version what happens on an airport tarmac
 */
package airportSimulation;

/**
 * Blueprint for a Runway object
 * @author eliza
 */
public class Runway {
    public String name;
    public int sizeSupported;
    public Airplane lastPlaneUsed;
    
    /**
     * decides which time to use to figure out when the Runway was last used
     * @return - time the Runway was last used
     */
    public String getTimeUsed(){
        String lastUsed;
        if(lastPlaneUsed == null){
            lastUsed = "N/A";
        }
        else if(lastPlaneUsed.status== "Departed"){
            lastUsed = lastPlaneUsed.departureTime;
        }else{
            lastUsed = lastPlaneUsed.arrivalTime;
        }//close if/else
        
        return lastUsed;
        
    }//close getTimeUsed
}//close Runway
