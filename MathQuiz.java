/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathquiz;
    import java.util.Random;
    import java.util.Scanner;
/**
 *
 * @author efaux01
 */
public class MathQuiz {
    static int realAnswer;
    static int userAnswer;
    static int a;
    static int b;
    static int c;
    static int timesAttempted;
    static boolean harder;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }//close main
    
    /**
     * Random number generator
     * @return a random number
     */
    public static int ranGen(){
        Random randGenerator = new Random();
        int number = randGenerator.nextInt() ;
        return number;
    }// close method ranGen
    
    /**
     * determine if equations should get harder
     * @return boolean harder
     */
    public static boolean correct(){
        harder = timesAttempted < 1;
        return harder;
    }//close method correct
    
}//close class MathQuiz
