/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airportsimulator;

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

    public static void main(String args[]){
        setBasicPlaneInfo();
        setPlaneSchedule();
        setPlaneFillLevels();
        setGates();
        setRunways();
    }//close main
    
    
    public static void setBasicPlaneInfo(){
        jetBlue4647 = new Airplane();
        
        jetBlue1285 = new Airplane();
        
        
        delta3481 = new Airplane();
        
        
        delta2161 = new Airplane();
                
                
        delta4176 = new Airplane();
                
                
        delta4028 = new Airplane();
        
        
        delta3985 = new Airplane();
        
        
        amAir4092 = new Airplane();
        
        
        amAir5231 = new Airplane();
        
        
        amAir1904 = new Airplane();
        
        
        
    }//close setBasicPlaneInfo
    
    /**
     * Sets variables for times, destination, and origin on all Airplanes
     */
    public static void setPlaneSchedule(){
    
    }//close setPlane Schedule
    
    /**
     * Sets variables for passengers, flightAttendents, pilots, and baggage on Airplanes
     */
    public static void setPlaneFillLevels(){
    
    }//close setPlaneFillLevels
    
    /**
     * Sets variables for gates
     */
    public static void setGates(){
        
    }//close setGates
    
    public static void setRunways(){
        
    }//close setRunways
    
    
}//close Airport
