/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generalAssignments;
    import java.util.Scanner;
/**
 *
 * @author eliza
 */
public class RestaurantPointOfSale {
    static int totalPorkSlidersOrdered;
    static int totalTurkeySlidersOrdered;
    static int totalHamburgerSlidersOrdered;
    static int totalChickenSlidersOrdered;
    
    static int bunSupply=400;
    static double porkSupply=90;
    static int BBQSupply=75;
    static double turkeySupply=81;
    static int baconSupply=94;
    static int lettuceSupply=400;
    static int cheeseSupply=150;
    static double beefSupply=120;
    static double chickenSupply=95;
    static int tomatoSupply=50;
            
    static int porkSlidersOnOrder;
    static int turkeySlidersOnOrder;
    static int hamburgerSlidersOnOrder;
    static int chickenSlidersOnOrder;
    static String type;
    static String ingredient;
    
    public static void main(String args []){
        menu();
    }//close main
    
    public static void menu(){
        boolean validChoice = true;
        int chooseMenu;
        do{
        System.out.println("What would you like to do?");
        System.out.println("1.Create New Order \n2.View Current Order \n3"
                + ".Current Supplies \n4.Today's Order Amounts \n5.Exit Program");
        chooseMenu=getInt();
        switch(chooseMenu){
            case 1:
                orderMenu();
                break;
            case 2:
                viewItemsOrdered();
            case 3:
                currentSupplyStatus();
                break;
            case 4: 
                slidersOrderedToday();
                break;
            case 5:
                exitProgram();
                break;
            default:
                System.out.println("Invalid entry. Try again. \n");
                validChoice = false;
        }
        }while(validChoice=false);
    }//close menu
        
                
    public static void orderMenu(){
        porkSlidersOnOrder = 0;
        turkeySlidersOnOrder = 0;
        hamburgerSlidersOnOrder = 0;
        chickenSlidersOnOrder = 0;
        
        boolean validChoice=true;
        int orderMenuChoice;
        do{
            System.out.println("New order started. What would you like to do?");
            System.out.println("1.Add Items to Order \n2.View Receept \n3.View "
                    + "Items On Order \n4.Return to Main Menu \n5.Exit Program");
            orderMenuChoice = getInt();
            switch(orderMenuChoice){
                case 1: 
                    sliderChoice();
                    break;
                case 2:
                    receipt();
                    break;
                case 3:
                    viewItemsOrdered();
                case 4:
                    menu();
                case 5:
                    exitProgram();
                default:
                    System.out.println("Invalid entry. Try again \n");
            }
        }while(validChoice=false);
    }//close orderMenu
    
    public static void sliderChoice(){
        boolean validEntry = true;
        int decideSliderType;
        do{
            System.out.println("What kind of slider was ordered?");
            System.out.println("1.Pulled Pork \n2.Turkey \n3.Hamburger \n4."
                    + "Grilled Chicken \n5.Return to Order Menu \n6.Return to "
                    + "Main Menu \n7.Exit Program");
            decideSliderType = getInt();
            switch(decideSliderType){
                case 1:
                    orderPorkSliders();
                    break;
                case 2:
                    orderTurkeySliders();
                    break;
                case 3:
                    orderHamburgerSliders();
                    break;
                case 4:
                    orderChickenSliders();
                    break;
                case 5:
                    orderMenu();
                    break;
                case 6:
                    menu();
                    break;
                case 7:
                    exitProgram();
                    break;
                default:
                    System.out.println("Invalid entry. Try Again.");
                    validEntry=false;
            }
        }while(validEntry=false);
    }//close sliderChoice
    
    public static void orderPorkSliders(){
        type = "Pulled pork";
        porkSlidersOnOrder=howManyOrdered();
        totalPorkSlidersOrdered+=porkSlidersOnOrder;
        bunSupplyAdjust(porkSlidersOnOrder);
        porkSupplyAdjust(porkSlidersOnOrder);
        BBQSupplyAdjust(porkSlidersOnOrder);
        orderMenu();
    }//close orderPorkSliders
    
    public static void orderTurkeySliders(){
        type = "Turkey";
        turkeySlidersOnOrder=howManyOrdered();
        totalTurkeySlidersOrdered+=turkeySlidersOnOrder;
        turkeySupplyAdjust(turkeySlidersOnOrder);
        bunSupplyAdjust(turkeySlidersOnOrder);
        baconSupplyAdjust(turkeySlidersOnOrder);
        lettuceSupplyAdjust(turkeySlidersOnOrder);
        cheeseSupplyAdjust(turkeySlidersOnOrder);
        orderMenu();
    }//close orderTurkeySliders
    
    public static void orderHamburgerSliders(){
        type = "Hamburger";
        hamburgerSlidersOnOrder=howManyOrdered();
        totalHamburgerSlidersOrdered+=hamburgerSlidersOnOrder;
        bunSupplyAdjust(hamburgerSlidersOnOrder);
        beefSupplyAdjust(hamburgerSlidersOnOrder);
        cheeseSupplyAdjust(hamburgerSlidersOnOrder);
        lettuceSupplyAdjust(hamburgerSlidersOnOrder);
        tomatoSupplyAdjust(hamburgerSlidersOnOrder);
        orderMenu();
    }//close orderHamburgerSliders
    
    public static void orderChickenSliders(){
        type="Grilled Chicken";
        chickenSlidersOnOrder=howManyOrdered();
        totalChickenSlidersOrdered+=chickenSlidersOnOrder;
        bunSupplyAdjust(chickenSlidersOnOrder);
        chickenSupplyAdjust(chickenSlidersOnOrder);
        lettuceSupplyAdjust(chickenSlidersOnOrder);
        tomatoSupplyAdjust(chickenSlidersOnOrder);
        orderMenu();
    }//close orderChickenSliders
    
    public static int howManyOrdered(){
        System.out.println("How many " + type + " sliders were ordered?");
        int numOrdered = getInt();
        return numOrdered;
    }//close howManyOrdered
    
    public static void bunSupplyAdjust(int numOrdered){
        ingredient="Buns";
        bunSupply-=calculateFourTimes(numOrdered);
        checkSupply(bunSupply);
    }//close bunSupplyCheckAdjust
    
    public static void porkSupplyAdjust(int numOrdered){
        ingredient="Pork";
        porkSupply-=calculateHalf(numOrdered);
        checkSupply(porkSupply);
    }//close porkSupplyCheckAdjust
    
    public static void BBQSupplyAdjust(int numOrdered){
        ingredient="BBQ Sauce";
        BBQSupply-=numOrdered;
        checkSupply(BBQSupply);
    }//close BBQSupplyCheckAdjust
    
    public static void turkeySupplyAdjust(int numOrdered){
        ingredient="Turkey";
        turkeySupply-=calculateHalf(numOrdered);
        checkSupply(turkeySupply);
    }//close turkeySupplyCheckAdjust
    
    public static void baconSupplyAdjust(int numOrdered){
        ingredient="Bacon";
        baconSupply-=calculateFourTimes(numOrdered);
        checkSupply(baconSupply);
    }//close baconSupplyCheckAdjust
    
    public static void lettuceSupplyAdjust(int numOrdered){
        ingredient="Lettuce";
        lettuceSupply-=calculateFourTimes(numOrdered);
        checkSupply(lettuceSupply);
    }//close lettuceSupplyCheckAdjust
    
    public static void cheeseSupplyAdjust(int numOrdered){
        ingredient="Cheese";
        cheeseSupply-=calculateFourTimes(numOrdered);
        checkSupply(cheeseSupply);
    }//close cheesesupplyCheckAdjust
    
    public static void beefSupplyAdjust(int numOrdered){
        ingredient="Beef";
        beefSupply-=calculateHalf(numOrdered);
        checkSupply(beefSupply);
    }//close beefSupplyCheckAdjust
    
    public static void tomatoSupplyAdjust(int numOrdered){
        ingredient="Tomato";
        tomatoSupply-=calculateFourTimes(numOrdered);
        checkSupply(tomatoSupply);
    }//close tomatoSupplyCheckAdjust
    
    public static void chickenSupplyAdjust(int numOrdered){
        ingredient="Chicken";
        chickenSupply-=calculateFourTimes(numOrdered);
        checkSupply(chickenSupply);
    }//close chickenSupplyCheckAdjust
    
    
    public static void checkSupply(double currentSupply){
        if(currentSupply<1){
            System.out.println("The order cannot be completed as ordered. You "
                    + "cannot make that many " + type + " Sliders. You are out"
                            + " of " + ingredient);
        }
    }//close checkSupply
        
    public static int calculateFourTimes(int numSliders){
        int number = numSliders * 4;
        return number;
    }//close calculateFourTimes
    
    public static double calculateHalf(int numSliders){
        double number = numSliders/4;
        return number;
    }//close calculateHalf
    
    public static int getInt(){
        Scanner userInput = new Scanner(System.in);
        int choice = userInput.nextInt();
        return choice;
    }//close getInt
    
    public static void viewItemsOrdered(){
        if(porkSlidersOnOrder!=0){
            System.out.println("Pulled Pork Sliders \tx " + porkSlidersOnOrder);
        }
        if(turkeySlidersOnOrder!=0){
            System.out.println("Turkey Sliders \tx " + turkeySlidersOnOrder);
        }
        if(hamburgerSlidersOnOrder!=0){
            System.out.println("Hamburger Sliders \tx " + hamburgerSlidersOnOrder);
        }   
        if(chickenSlidersOnOrder!=0){
            System.out.println("Grilled Chicken Sliders \tx " + chickenSlidersOnOrder);
        }
    }//close viewItemsOrdered
    
    public static void receipt(){
        final double PORK_SLIDER_PRICE = 0;
        final double TURKEY_SLIDER_PRICE = 0;
        final double HAMBURGER_SLIDER_PRICE = 0;
        final double CHICKEN_SLIDER_PRICE = 0;
        
        double porkTotal=0;
        double turkeyTotal=0;
        double hamburgerTotal=0;
        double chickenTotal=0;
        double subtotal;
        double tax;
        double total;
        if(porkSlidersOnOrder!=0){
            type = "Pulled Pork";
            porkTotal=calcSliderSubtotal(PORK_SLIDER_PRICE,porkSlidersOnOrder);
        }
        if(turkeySlidersOnOrder!=0){
            type="Turkey";
            turkeyTotal=calcSliderSubtotal(TURKEY_SLIDER_PRICE,turkeySlidersOnOrder);
        }
        if(hamburgerSlidersOnOrder!=0){
            type="Hamburger";
            hamburgerTotal=calcSliderSubtotal(HAMBURGER_SLIDER_PRICE,hamburgerSlidersOnOrder);
        }   
        if(chickenSlidersOnOrder!=0){
            type="Grilled Chicken";
            chickenTotal=calcSliderSubtotal(CHICKEN_SLIDER_PRICE,chickenSlidersOnOrder);
        }
        
        subtotal = porkTotal+turkeyTotal+hamburgerTotal+chickenTotal;
        tax=calcTax(subtotal);
        total = subtotal+tax;
        System.out.println("Total \t\t\t= $" + total);
    }//close receipt
    
    public static double calcSliderSubtotal(double sliderPrice, int numSliders){
        double sliderSubtotal = sliderPrice*numSliders;
        System.out.println(type + " Sliders \tx " + numSliders + "\t@ $" + sliderPrice);
        return sliderSubtotal;
    }//close calcSliderSubtotal
    
    public static double calcTax(double subtotal){
        final double TAX_RATE=0.7;
        double tax = subtotal*TAX_RATE;
        System.out.println("Tax \t\t\t= $" + tax);
        return tax;
    }//close calcSubtotal
    
    public static void currentSupplyStatus(){
        System.out.println("*******Onhand Supply Status*******");
        System.out.println("Buns: " + bunSupply);
        System.out.println("Pork: " + porkSupply + "lbs");
        System.out.println("BBQ Sauce: " + BBQSupply + " servings");
        System.out.println("Turkey: " + turkeySupply + "lbs");
        System.out.println("Bacon: " + baconSupply + " pieces");
        System.out.println("Lettuce: " + lettuceSupply + " leaves");
        System.out.println("Cheese: " + cheeseSupply + " pieces");
        System.out.println("Beef: " + beefSupply + "lbs");
        System.out.println("Chicken: " + chickenSupply + "lbs");
        System.out.println("Tomato: " + tomatoSupply + "slices");
         
        menu();
    }//close currentSupplyStatus
    
    public static void slidersOrderedToday(){
        System.out.println("*******Slider Order Report*******");
        System.out.println("Pulled Pork Sliders: " + totalPorkSlidersOrdered);
        System.out.println("Turkey Sliders: " + totalTurkeySlidersOrdered);
        System.out.println("Hamburger Sliders: " + totalHamburgerSlidersOrdered);
        System.out.println("Grilled Chicken Sliders: " + totalChickenSlidersOrdered);
        
        menu();
    }//close slidersOrderedToday
    
    public static void exitProgram(){
        System.exit(0);
    }//close exitProgram
}
