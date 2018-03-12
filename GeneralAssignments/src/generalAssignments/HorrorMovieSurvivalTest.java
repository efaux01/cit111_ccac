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
    public static void main (String[]args){
        System.out.println("Welcome to the Horror Movie Survival Test! "
                + "Continue on to find out if you will survive.");
        basicInfo();
    }//close main
    
    public static void basicInfo(){
        String fName;
        String lName;
        int age;
        int strength;
        
        
        System.out.println("First, lets get some basic information about you.");
        
        System.out.println("What is your first name?");
        fName = getText();
        
        System.out.println("And what is your last name?");
        lName = getText();
        
        System.out.println("How old are you?");
        age = getNumber();
        
        System.out.println("How do you rate your strenght?");
        System.out.println("1.Strong \n2.Average \n3.Weak");
        while(strength !=1,2,3){
            strength = getNumber();
        }
        menu();
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
    
    public static void menu(){
        int decision;
        boolean keepGoing = true;
        
        
        while(keepGoing){
            System.out.println("What kind of Horror Movie are you in(Type a number)?");
            System.out.println("1.Zombie \n2.Serial Killer \n3.Alien \n4.Supernatural");
            decision = getNumber();
            switch(decision){
                case 1:
                
                    break;
                case 2:
                
                    break;
                case 3:
                
                    break;
                case 4:
                
                    break;
                default:
                    System.out.println("Invalid entry, try again.");
            }//close switch
        }//close while loop
    }//close menu
}
