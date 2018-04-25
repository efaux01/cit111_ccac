/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectPractice;

/**
 *
 * @author efaux01
 */
public class Donut {
    public int percRemaining = 100;
    public String name;
    public boolean isManufactured;
    public double calories;
    public String coating;
    public int ID;
    
    public void simulateEating(int percentEaten){
        percRemaining = percRemaining - percentEaten;
    }//close method
    
    public int getPercRemaining(){
        return percRemaining;
    }//close method
}
