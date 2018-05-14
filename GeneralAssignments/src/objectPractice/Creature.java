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
public class Creature {
    public String name;
    public String species;
    
    private int biteSizeInPercent;
    private int numBitesTaken;
    private int sizeLimit;
    private boolean likesDonuts;
    
    //Method to simulate eating donut
    public void eatDonut(Donut namedDonut){
        //we'll program guts here
        if(likesDonuts == false){
            System.out.println("Uh oh! looks like the " + species 
                    + " doesn't like donuts." + name + " isn't eating it.");
        }
        else{
            System.out.println("Eating Donut....");    
            int percentEaten=biteSizeInPercent*numBitesTaken;
            namedDonut.simulateEating(percentEaten);
        }
    }    
        
    public int setNumBitesTaken(int numBitesTaken){
        this.numBitesTaken = numBitesTaken;
        return numBitesTaken;
    }
    
    public boolean setCreatureLikesDonuts(boolean yumDonuts){
        this.likesDonuts = yumDonuts;
        System.out.println("Likes Donuts: " + likesDonuts);
        return likesDonuts;
    }
    
    
    //"getter" method for a private member variable: sizeLimit
    public int getSizeLimit(){
        //just send back the value of sizeLimit
        return sizeLimit;
    }
    
    //"setter" method for private member vaiable: sizeLimit
    public void setSizeLimit(int sizeLimit){
        //we need guts to check for a reasonable size limit
        if (sizeLimit>100 || sizeLimit < 0){
            System.out.println("Invalid size limit. Try again.");
        }else{
            this.sizeLimit=sizeLimit;  
        }
         
    }
    
    //"getter" method for biteSizeInPercent
    public int getBiteSizeInPercent(){
        return biteSizeInPercent;
    }
    
    //"setter" method for biteSizeInPercent
    public void setBiteSizeInPercent(int biteSizeInPercent){
        //we need guts to check bite size
        if (biteSizeInPercent<0 || biteSizeInPercent>100){
            System.out.println("Invalid bite Size. Try Again.");
        }else{
            this.biteSizeInPercent=biteSizeInPercent;
        }
    }
}//close class
