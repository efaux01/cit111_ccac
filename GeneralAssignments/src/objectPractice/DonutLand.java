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
public class DonutLand {
    public static void main(String args[]){
        Donut firstDonut = new Donut();
        firstDonut.name = "Chocolate";
        firstDonut.calories = 70;
        firstDonut.percRemaining = 100;
        firstDonut.coating = "Chocolate";
        
        Donut secondDonut = new Donut();
        secondDonut.name = "Cinnamon-sugar";
        secondDonut.calories = 55;
        secondDonut.percRemaining = 100;
        secondDonut.coating = "Cinnamon-Powdered Sugar";
        
        Donut thirdDonut = new Donut();
        thirdDonut.name = "Strawberry";
        thirdDonut.calories = 72.5;
        thirdDonut.percRemaining = 100;
        thirdDonut.coating = "Strawberry Frosting";
        
        Donut fourthDonut = new Donut();
        fourthDonut.name = "Powdered Sugar";
        fourthDonut.calories = 55;
        fourthDonut.percRemaining = 100;
        fourthDonut.coating = "Powdered Sugar";
        
        Donut fifthDonut = new Donut();
        fifthDonut.name = "Apple";
        fifthDonut.calories = 50;
        fifthDonut.percRemaining = 100;
        fifthDonut.coating = "Crumbs";
        
        
        System.out.println(firstDonut);
        System.out.println(secondDonut);
        System.out.println(thirdDonut);
        System.out.println(fourthDonut);
        System.out.println(fifthDonut);
        
        int biteSize = 25;
        eatDonut(firstDonut,biteSize);
    }            
                
        public static void eatDonut(Donut donutToEat, int bite){
            System.out.println("Taking a bite of " + donutToEat.name  +". Yum,yum,yum.");
            donutToEat.percRemaining -= bite;
            System.out.println("Percent of " + donutToEat.name + " remaining: " + donutToEat.percRemaining);
    }
}
