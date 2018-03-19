/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generalAssignments;
    import java.util.Scanner;
/**
 *
 * @author efaux01
 */
public class HorrorMovieSurvivalTest {
        static String fName;
        static String lName;
        static int age;
        static int strength = 0;
        static int speed = 0;
        static int gender = 0;
        static int location;
        static boolean firstTime = true;
        static int group;
        static int movement;
        static boolean survival = true;
        static int movieType = 0;
        static int score;
        
    public static void main (String[]args){
        System.out.println("Welcome to the Horror Movie Survival Test! "
                + "Continue on to find out if you will survive.");
        start();
        
    }//close main

    public static void start(){
        if(firstTime){
            name();
            movieSelect();
            basicInfo();
        } else{
            System.out.println("Hello, " + fName + " " + lName + ". It looks like you've played before."
                    + " Would you like to keep your old \nphysical stats? Type y for yes and n for no");
            String changeStats = getText();
            switch(changeStats){
                case "y":
                    movieSelect();
                    break;
                case "n":
                    movieSelect();
                    basicInfo();
            }//close switch
        }//close if/else
        whereAreYou();
        aloneOrTogether();
        runOrStay();
        
        switch(movieType){
            case 1:
                zombie();
            case 2:
                serialKiller();
            case 3:
                alien();
            case 4:
                supernatural();
        }//close switch
        if (score>45)survival=false;
        endProgram();
    }//close main
    
    public static String getText(){
        Scanner userInput = new Scanner(System.in);
        String text = userInput.next();
        return text;
    }//close getText
    
    public static int getNumber(){
        Scanner scanNum = new Scanner(System.in);
        int num = scanNum.nextInt();
        return num;
    }//close getNumber
    
    public static void name(){
        System.out.println("What is your first name?");
    
        fName = getText();
        
        System.out.println("And what is your last name?");
        lName = getText();
    }//close name
    
     public static void basicInfo(){
        System.out.println("First, let's get some basic information about you.\n");
        
        System.out.println("How old are you?");
        age = getNumber();
        
        while((strength !=1) && (strength !=2) && (strength !=3)){
            System.out.println("How do you rate your strenght?");
            System.out.println("1.Weak \n2.Average \n3.Strong");
        
            strength = getNumber();
        }
        
        while (speed !=1 && speed !=2 && speed !=3){
            System.out.println("How do you rate your speed?");
            System.out.println("1.Slow \n2.Average \n3.Fast");
            
            speed = getNumber();
        }
        
        while(gender != 1 && gender != 2 && gender != 3){
            System.out.println("What gender are you?");
            System.out.println("1.Female \n2.Male \n3.Other");
            
            gender = getNumber();
        }
        firstTime=false;
    }//close basicInfo
     
    public static void movieSelect(){
        movieType = 0;
        while(movieType !=1 && movieType !=2 && movieType !=3 && movieType !=4){
            System.out.println("What kind of Horror Movie are you in?");
            System.out.println("1.Zombie \n2.Serial Killer \n3.Alien \n4.Supernatural");
            movieType = getNumber();
        }//close while loop
    }//close movieSelector
    
    public static void whereAreYou(){
        location = 0;
        while(location !=1 && location !=2 && location !=3){
            System.out.println("Where do you live?");
            System.out.println("1.The Country \n2.The Suburbs \n3.The City");
            location = getNumber();
        }//close while
    }//close whereAreYou()
    
    public static void aloneOrTogether(){
        System.out.println("How many people are you with? If you've decided to go it alone type 0.");
        group = getNumber();
    }//close aloneOrTogether
    
    public static void runOrStay(){
        movement = 0;
        while(movement !=1 && movement !=2){
            System.out.println("Do you stay put in your current location or make a run for it?");
            System.out.println("1.Stay where you are \n2.Run for it!");
            movement = getNumber();
        }//close while
    }//close runOrStay
    
    public static void zombie(){
        if(age >= 50){
            score = score + 10;
        }else if (age < 18){
            score = score + 5;
        }else score = score + 1;
        
        switch (gender){
            case 1:
                score = score + 5;
            case 2:
                score = score + 1;
            case 3:
                score = score + 10;
        }
        switch (strength){
            case 1:
                score = score + 5;
            case 2:
                score = score + 10;
            case 3:
                score = score + 1;
        }
        switch (speed){
            case 1:
                score = score + 15;
            case 2:
                score = score + 5;
            case 3:
                score = score + 1;
        }
        switch (location){
            case 1:
                score = score + 1;
            case 2:
                score = score + 5;
            case 3:
                score = score + 15;
        }
        if(group>10){
            score = score + 5;
        }else if(group < 1){
            score = score + 1;
        }else score = score +10;
        switch (movement){
            case 1:
                score = score + 1;
            case 2:
                score = score + 10;
        }
    }//close zombie
    
    public static void serialKiller(){
        if(age >= 40){
            score = score + 5;
        }else if (age < 14){
            score = score + 1;
        }else score = score + 10;
        
        switch (gender){
            case 1:
                score = score + 10;
            case 2:
                score = score + 3;
            case 3:
                score = score + 1;
        }
        //add points for strength
        score = score + 5;
       
        switch (speed){
            case 1:
                score = score + 10;
            case 2:
                score = score + 5;
            case 3:
                score = score + 1;
        }
        switch (location){
            case 1:
                score = score + 10;
            case 2:
                score = score + 5;
            case 3:
                score = score + 1;
        }
        if(group>5){
            score = score + 1;
        }else if(group < 1){
            score = score + 10;
        }else score = score +5;
        switch (movement){
            case 1:
                score = score + 10;
            case 2:
                score = score + 5;
        }
    }//close serialKiller
    
    public static void alien(){
       if(age >= 50){
            score = score + 1;
        }else if (age < 18){
            score = score + 5;
        }else score = score + 10;
        
        switch (gender){
            case 1:
                score = score + 5;
            case 2:
                score = score + 5;
            case 3:
                score = score + 1;
        }
        switch (strength){
            case 1:
                score = score + 1;
            case 2:
                score = score + 5;
            case 3:
                score = score + 10;
        }
        switch (speed){
            case 1:
                score = score + 1;
            case 2:
                score = score + 5;
            case 3:
                score = score + 10;
        }
        switch (location){
            case 1:
                score = score + 5;
            case 2:
                score = score + 10;
            case 3:
                score = score + 1;
        }
        if(group>10){
            score = score + 5;
        }else if(group < 1){
            score = score + 10;
        }else score = score +5;
        switch (movement){
            case 1:
                score = score + 5;
            case 2:
                score = score + 1;
        } 
    }//close alien
    
    public static void supernatural(){
        if(age >= 35){
            score = score + 10;
        }else if (age < 12){
            score = score + 1;
        }else score = score + 10;
        
        switch (gender){
            case 1:
                score = score + 5;
            case 2:
                score = score + 10;
            case 3:
                score = score + 5;
        }
        switch (strength){
            case 1:
                score = score + 5;
            case 2:
                score = score + 1;
            case 3:
                score = score + 10;
        }
        switch (speed){
            case 1:
                score = score + 1;
            case 2:
                score = score + 5;
            case 3:
                score = score + 10;
        }
        switch (location){
            case 1:
                score = score + 10;
            case 2:
                score = score + 5;
            case 3:
                score = score + 1;
        }
        if(group>10){
            score = score + 10;
        }else if(group < 1){
            score = score + 1;
        }else score = score +5;
        switch (movement){
            case 1:
                score = score + 10;
            case 2:
                score = score + 1;
        }
    }//close supernatural
    
    public static void endProgram(){
        System.out.println("You have reached the end of the horror movie survival test!");
        if(survival){
            System.out.println("Congratulations, you survived the horror movie!");
        }else{
            System.out.println("Aw, that's too bad. You DIED in the horror movie!");
        }//close if/else
        
        System.out.println("Would you like to: \n1.Restart the test \n2.End the program");
        int restart = getNumber();
        switch(restart){
            case 1:
               start(); 
            case 2:
               System.exit(0);
        }//close switch
    }//close endProgram
}//close class HorrorMovieSurvivalTest
