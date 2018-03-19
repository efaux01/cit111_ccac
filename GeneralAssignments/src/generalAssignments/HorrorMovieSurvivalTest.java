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
        
    public static void main (String[]args){
        System.out.println("Welcome to the Horror Movie Survival Test! "
                + "Continue on to find out if you will survive.");
        
        if(firstTime){
            name();
            movieSelect();
            basicInfo();
        } else{
            System.out.println("Hello, " + fName + "" + lName + ". It looks like you've played before."
                    + " Would you like to keep your old physical stats? Type y for yes and n for no");
            String changeStats = getText();
            switch(changeStats){
                case "y":
                    movieSelect();
                case "n":
                    movieSelect();
                    basicInfo();
            }//close switch
        }//close if/else
        
    }//close main
    public static void name(){
        System.out.println("What is your first name?");
    
        fName = getText();
        
        System.out.println("And what is your last name?");
        lName = getText();
    }
    
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
    }//close basicInfo
    
    public static String getText(){
        Scanner userInput = new Scanner(System.in);
        String text = userInput.next();
        return text;
    }//close getText
    
    public static int getNumber(){
        Scanner scanNum = new Scanner(System.in);
        int num = scanNum.nextInt();
        return num;
    }
    
    public static void movieSelect(){
        int movieType = 0;
        
        while(movieType !=1 && movieType !=2 && movieType !=3 && movieType !=4){
            System.out.println("What kind of Horror Movie are you in?");
            System.out.println("1.Zombie \n2.Serial Killer \n3.Alien \n4.Supernatural");
            movieType = getNumber();
        }//close while loop
    }//close movieSelector
    
    public static void location(){
        while(location !=1 && location !=2 && location !=3 && location!=4){
            System.out.println("Where do you live?");
            System.out.println("1.The Country \n2.The Suburbs \n3.The City");
        }
        
    
    }
}//close class HorrorMovieSurvivalTest
