/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectPractice;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author efaux01
 */
public class CreatureLand {
    public static void main (String args []){
        //make a new creature
        Creature turtle = new Creature();
        //set it's species member vaiable
        turtle.species = "Turtle";
        
        //make a new Donut object
        Donut d = new Donut();
        d.name = "Cinnamon"; 
        d.ID = 627;
        
        printDonutStats(d);
        
        turtle.setBiteSizeInPercent(20);
        turtle.setNumBitesTaken(3);
        turtle.eatDonut(d);
        
        printDonutStats(d);
        
        Creature grayKitten = new Creature();
        grayKitten.species = "Gray Kitten";
        grayKitten.name = "Socks"; 
                
        Donut e = new Donut();
        e.name = "Plain";
        e.ID = 214;
        
        printDonutStats(e);
        
        grayKitten.setBiteSizeInPercent(10);
        grayKitten.setNumBitesTaken(1);
        grayKitten.setCreatureLikesDonuts(false);
        grayKitten.eatDonut(e);
        
        printDonutStats(e);
        
        
    }
    
    public static void printDonutStats(Donut donutToPrint){
        System.out.println("*****STATS*****");
        System.out.println("Donut Type: " + donutToPrint.name);
        System.out.println("Donut ID: " + donutToPrint.ID);
        System.out.println("Percent Remaining: " + donutToPrint.percRemaining);
    }
}
