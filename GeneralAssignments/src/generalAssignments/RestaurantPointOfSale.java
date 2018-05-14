/*
 * Program simulating a simple point of sale system for a restaaurant that 
 * serves 4 types of sliders. Also keeps track of ingredient supplies on hand
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
    
    static boolean addToOrder = true;
    static int ingredientNumber;
    static int slidersOrdered;
    
    /**
     * main
     * @param args 
     */
    public static void main(String args []){
        menu();
    }//close main
    
    /**
     * First menu, user decides what to do/view
     */
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
                createNewOrder();
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
    
    /**
     * creates a new order by zeroing out old order values
     */
    public static void createNewOrder(){
        System.out.println("\nNew order created.");
        porkSlidersOnOrder = 0;
        turkeySlidersOnOrder = 0;
        hamburgerSlidersOnOrder = 0;
        chickenSlidersOnOrder = 0; 
        orderMenu();
    }//close createNewOrder
    
    /**
     * user chooses what to do to an order
     */            
    public static void orderMenu(){
        boolean validChoice=true;
        int orderMenuChoice;
        do{
            System.out.println("\nWhat would you like to do?");
            System.out.println("1.Add Items to Order \n2.View Receipt \n3.View "
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
    
    /**
     * user decides what kind of slider to add to the order
     */
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
    
    /**
     * user orders pork sliders setting type, adjusting pork orders for the day
     * and the supplies that are consumed for the ordered value
     */
    public static void orderPorkSliders(){
        type = "Pulled pork";
        howManyOrdered();
        addToOrder=true;
        bunSupplyAdjust();
        porkSupplyAdjust();
        BBQSupplyAdjust();
        if(addToOrder=true){
            porkSlidersOnOrder+=slidersOrdered;
            totalTurkeySlidersOrdered+=slidersOrdered;
        }
        orderMenu();
    }//close orderPorkSliders
    
    /**
     * user orders turkey sliders setting type, adjusting pork orders for the day
     * and the supplies that are consumed for the ordered value
     */
    public static void orderTurkeySliders(){
        type = "Turkey";
        howManyOrdered();
        addToOrder=true;
        turkeySupplyAdjust();
        bunSupplyAdjust();
        baconSupplyAdjust();
        lettuceSupplyAdjust();
        cheeseSupplyAdjust();
        if(addToOrder=true){
            turkeySlidersOnOrder+=slidersOrdered;
            totalTurkeySlidersOrdered+=slidersOrdered;
        }
        orderMenu();
    }//close orderTurkeySliders
    
    /**
     * user orders hamburger sliders setting type, adjusting pork orders for the day
     * and the supplies that are consumed for the ordered value
     */
    public static void orderHamburgerSliders(){
        type = "Hamburger";
        howManyOrdered();
        addToOrder=true;
        bunSupplyAdjust();
        beefSupplyAdjust();
        cheeseSupplyAdjust();
        lettuceSupplyAdjust();
        tomatoSupplyAdjust();
        if(addToOrder=true){
            hamburgerSlidersOnOrder+=slidersOrdered;
            totalHamburgerSlidersOrdered+=slidersOrdered;
        }
        orderMenu();
    }//close orderHamburgerSliders
    
    /**
     * user orders chicken sliders setting type, adjusting pork orders for the day
     * and the supplies that are consumed for the ordered value
     */
    public static void orderChickenSliders(){
        type="Grilled Chicken";
        howManyOrdered();
        addToOrder=true;
        bunSupplyAdjust();
        chickenSupplyAdjust();
        lettuceSupplyAdjust();
        tomatoSupplyAdjust();
        if(addToOrder=true){
            totalChickenSlidersOrdered+=slidersOrdered;
            chickenSlidersOnOrder+=slidersOrdered;
        }
        orderMenu();
    }//close orderChickenSliders
    
    /**
     * asks for and collects the number of sliders being ordered of variable type
     */
    public static void howManyOrdered(){
        System.out.println("How many " + type + " sliders were ordered?");
        slidersOrdered= getInt();
    }//close howManyOrdered
    
    /**
     * adjusts bun supply based on number of sliders ordered
     */
    public static void bunSupplyAdjust(){
        ingredient="Buns";
        bunSupply-=calculateFourTimes();
        checkSupply(bunSupply);
    }//close bunSupplyCheckAdjust
    
    /**
     * adjusts pork supply based on number of sliders ordered
     */
    public static void porkSupplyAdjust(){
        ingredient="Pork";
        porkSupply-=calculateHalf(slidersOrdered);
        checkSupply(porkSupply);
    }//close porkSupplyCheckAdjust
    
    /**
     * adjusts BBQ sauce supply based on number of sliders ordered
     */
    public static void BBQSupplyAdjust(){
        ingredient="BBQ Sauce";
        BBQSupply-=slidersOrdered;
        checkSupply(BBQSupply);
    }//close BBQSupplyCheckAdjust
    
    /**
     * adjusts turkey supply based on number of sliders ordered
     */
    public static void turkeySupplyAdjust(){
        ingredient="Turkey";
        turkeySupply-=calculateHalf(slidersOrdered);
        checkSupply(turkeySupply);
    }//close turkeySupplyCheckAdjust
    
    /**
     * adjusts bacon supply based on number of sliders ordered
     */
    public static void baconSupplyAdjust(){
        ingredient="Bacon";
        baconSupply-=calculateFourTimes();
        checkSupply(baconSupply);
    }//close baconSupplyCheckAdjust
    
    /**
     * adjusts lettuce supply based on number of sliders ordered
     */
    public static void lettuceSupplyAdjust(){
        ingredient="Lettuce";
        lettuceSupply-=calculateFourTimes();
        checkSupply(lettuceSupply);
    }//close lettuceSupplyCheckAdjust
    
    /**
     * adjusts cheese supply based on number of sliders ordered
     */
    public static void cheeseSupplyAdjust(){
        ingredient="Cheese";
        cheeseSupply-=calculateFourTimes();
        checkSupply(cheeseSupply);
    }//close cheesesupplyCheckAdjust
    
    /**
     * adjusts beef supply based on number of sliders ordered
     */
    public static void beefSupplyAdjust(){
        ingredient="Beef";
        beefSupply-=calculateHalf(slidersOrdered);
        checkSupply(beefSupply);
    }//close beefSupplyCheckAdjust
    
    /**
     * adjusts tomato supply based on number of sliders ordered
     */
    public static void tomatoSupplyAdjust(){
        ingredient="Tomato";
        ingredientNumber=calculateFourTimes();
        checkSupply(tomatoSupply);
        supplyAdjuster(tomatoSupply);
    }//close tomatoSupplyCheckAdjust
    
    /**
     * adjusts chicken supply based on number of sliders ordered
     * @param numOrdered 
     */
    public static void chickenSupplyAdjust(){
        ingredient="Chicken";
        ingredientNumber=calculateFourTimes();
        checkSupply(chickenSupply);
        supplyAdjuster(chickenSupply);
    }//close chickenSupplyCheckAdjust
    
    public static void supplyAdjuster(double onHand){
        if(addToOrder=true){
            onHand-=ingredientNumber;
        }
    }
    
    /**
     * checks amount of an ingredient on hand against the amount needed for the order
     * @param currentSupply 
     */
    public static void checkSupply(double currentSupply){
        if(currentSupply-ingredientNumber<1){
            System.out.println("The order cannot be completed as ordered. You "
                    + "cannot make that many " + type + " Sliders. You are out"
                            + " of " + ingredient);
            System.out.println("Item(s) not added to order.");
            addToOrder=false;
        }
    }//close checkSupply
        
    /**
     * calculates four times number of sliders
     * @return number
     */
    public static int calculateFourTimes(){
        int number = slidersOrdered * 4;
        return number;
    }//close calculateFourTimes
    
    /**
     * calculates half the number of values
     * @param numSliders
     * @return 
     */
    public static double calculateHalf(int numSliders){
        double number = numSliders/4;
        return number;
    }//close calculateHalf
    
    /**
     * collects an integer from the user
     * @return integer
     */
    public static int getInt(){
        Scanner userInput = new Scanner(System.in);
        int choice = userInput.nextInt();
        return choice;
    }//close getInt
    
    /**
     * Displays the current active order
     */
    public static void viewItemsOrdered(){
        System.out.println("********Current Order*******");
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
    
    /**
     * displays the receipt for the order
     */
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
    
    /**
     * calculates the subtotal of the number of 
     * @param sliderPrice
     * @param numSliders
     * @return subtotal of one kind of slider
     */
    public static double calcSliderSubtotal(double sliderPrice, int numSliders){
        double sliderSubtotal = sliderPrice*numSliders;
        System.out.println(type + " Sliders \tx " + numSliders + "\t@ $" + sliderPrice);
        return sliderSubtotal;
    }//close calcSliderSubtotal
    
    /**
     * calculates the tax on an order
     * @param subtotal total of order without tax
     * @return amount of tax
     */
    public static double calcTax(double subtotal){
        final double TAX_RATE=0.7;
        double tax = subtotal*TAX_RATE;
        System.out.println("Tax \t\t\t= $" + tax);
        return tax;
    }//close calcSubtotal
    
    /**
     * displays the on hand amount of each ingredient
     */
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
    
    /**
     * displays the total amount of each type of slider ordered during the run
     * of the program
     */
    public static void slidersOrderedToday(){
        System.out.println("*******Slider Order Report*******");
        System.out.println("Pulled Pork Sliders: " + totalPorkSlidersOrdered);
        System.out.println("Turkey Sliders: " + totalTurkeySlidersOrdered);
        System.out.println("Hamburger Sliders: " + totalHamburgerSlidersOrdered);
        System.out.println("Grilled Chicken Sliders: " + totalChickenSlidersOrdered);
        
        menu();
    }//close slidersOrderedToday
    
    /** 
     * exits the program
     */
    public static void exitProgram(){
        System.exit(0);
    }//close exitProgram
}
