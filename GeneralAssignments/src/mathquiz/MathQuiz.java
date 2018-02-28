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
    static double realAnswer;
    static double userAnswer;
    static int a;
    static int b;
    static int c;
    static int timesAttempted;
    static final int TIMES_ALLOWED = 3;
    static boolean harder = false;
    static final int UPPER_LIMIT = 3;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Math Quiz!");
        
        easy1();
        easy2();
        easy3();
        easy4();
        medium1();
        medium2();
        medium3();
        medium4();
        difficult1();
        difficult2();
        difficult3();
        difficult4();
        
        System.out.println("Congradulations! You have completed the Math Quiz");
    }//close main
    
    /**
     * Generate a random number
     * @return a random number
     */
    public static int ranGen(){
        Random randGenerator = new Random();
        int number = randGenerator.nextInt(UPPER_LIMIT) ;
        return number;
    }// close method ranGen
    
   /**
    * Generate a random number that is not zero
    * @return a random number that is not zero
    */
    public static int notZeroGen(){
        int notZero = 0;
        
        while(notZero < 1){
            Random numGenerator = new Random();
            notZero = numGenerator.nextInt(UPPER_LIMIT);
        }//close while 
        return notZero;
        
    }//close notZeroGen
    
    /**
     * displays message if the user got the question right
     */
    public static void correct(){
        System.out.println("Correct! Next:");
    }//close correct
    
    /**
     * displays a message if the user got the question wrong
     */
    public static void incorrect(){
        System.out.println("Incorrect! \nYou have tried " + timesAttempted + " times.");
        System.out.println("You can try " + TIMES_ALLOWED + " times.");
    }
    
    /**
     * gets an answer from the user. Advances the timesAttempted count
     */
    public static void getAnswer(){
        Scanner scanAnswer = new Scanner(System.in);
        userAnswer = scanAnswer.nextDouble();
        timesAttempted ++;
    }
    
    /**
     * decide if 
     * @return boolean harder 
     */
    public static boolean getHarder(){
        final int TOO_MANY = 2;
        
        if(timesAttempted < TOO_MANY){
            harder =  true;
        }else harder = false;
        return harder;
    }
    
    /**
     * first easy math problem
     */
    public static void easy1(){
        while(harder = false){
            System.out.println("Try this:");
            a=ranGen();
            b=ranGen();
        
            realAnswer = a+b;
            for(timesAttempted = 0;timesAttempted < TIMES_ALLOWED;){
                System.out.println(a + " + " + b + " =");
                getAnswer();
                if (userAnswer == realAnswer){
                    correct();
                    break;
                }else{
                    incorrect();
                }//close if/else
            }//close for loop
            harder = getHarder();
        }//close while loop
        
    }//close easy1
    
    /**
     * second easy math problem
     */
    public static void easy2(){
        a=ranGen();
        b=ranGen();
        
        realAnswer = a-b;
        for(timesAttempted = 0;timesAttempted < TIMES_ALLOWED;){
            System.out.println(a + " - " + b + " =");
            getAnswer();
            if (userAnswer == realAnswer){
                correct();
                break;
            }else{
                incorrect();
            }//close if/else
        }//close for loop
        harder = getHarder();
        if(harder = false){
            System.out.println("Try this instead:");
            easy1();
        }
    }//close easy2
  
    /**
     * third easy math problem
     */
    public static void easy3(){
        a=ranGen();
        b=ranGen();
        
        realAnswer = a*b;
        for(timesAttempted = 0;timesAttempted < TIMES_ALLOWED;){
            System.out.println(a + " x " + b + " =");
            getAnswer();
            if (userAnswer == realAnswer){
                correct();
                break;
            }else{
                incorrect();
            }//close if/else
        }//close for loop
        harder = getHarder();
        if(harder = false){
            System.out.println("Try this instead:");
            easy2();
        }
    }//close easy3
    
    /**
     * forth easy math problem
     */
    public static void easy4(){
        a=ranGen();
        b=notZeroGen();
        
        realAnswer = a/b;
        for(timesAttempted = 0;timesAttempted < TIMES_ALLOWED;){
            System.out.println(a + " / " + b + " =");
            getAnswer();
           if (userAnswer == realAnswer){
                correct();
                break;
            }else{
                incorrect();
            }//close if/else
        }//close for loop
        harder = getHarder();
        if(harder = false){
            System.out.println("Try this instead:");
            easy3();
        }
    }//close easy4
    
    /**
     * First medium math problem
     */
    public static void medium1(){
        a=ranGen();
        b=ranGen();
        c=ranGen();
        
        realAnswer = a+b-c;
        for(timesAttempted = 0;timesAttempted<TIMES_ALLOWED;){
            System.out.println(a + " + " + b + " - " + c + " =");
            getAnswer();
            if(userAnswer == realAnswer){
                correct();
                break;
            }else{
                incorrect();
            }//close if/else
        }//close for loop
        harder = getHarder();
        if(harder = false){
            System.out.println("Try this instead:");
            easy4();
        }
    }//close medium1
    
   /** 
    * second medium math problem
    */
    public static void medium2(){
        a=ranGen();
        b=ranGen();
        c=ranGen();
        
        realAnswer = a+b*c;
        for(timesAttempted = 0;timesAttempted<TIMES_ALLOWED;){
            System.out.println(a + " + " + b + " x " + c + " =");
            getAnswer();
            if(userAnswer == realAnswer){
                correct();
                break;
            }else{
                incorrect();
            }//close if/else
        }//close for loop
        harder = getHarder();
        if(harder=false){
            System.out.println("Try this instead:");
            medium1();
        }
    }//close medium2
   
   /**
    * Third medium math problem
    */
    public static void medium3(){
        a=ranGen();
        b=ranGen();
        c=ranGen();
        
        realAnswer = a*b-c;
        for(timesAttempted = 0;timesAttempted<TIMES_ALLOWED;){
            System.out.println(a + " x " + b + " - " + c + " =");
            getAnswer();
            if(userAnswer == realAnswer){
                correct();
                break;
            }else{
                incorrect();
            }//close if/else
        }//close for loop
        harder = getHarder();
        if(harder=false){
            System.out.println("Try this instead:");
            medium2();
        }
    }//close medium3
   
   /**
    * Forth medium math problem
    */
    public static void medium4(){
        a=ranGen();
        b=ranGen();
        c=ranGen();
        
        realAnswer = a*b*c;
        for(timesAttempted = 0;timesAttempted<TIMES_ALLOWED;){
            System.out.println(a + " x " + b + " x " + c + " =");
            getAnswer();
            if(userAnswer == realAnswer){
                correct();
                break;
            }else{
                incorrect();
            }//close if/else
        }//close for loop
        harder = getHarder();
        if(harder = false){
            System.out.println("Try this instead:");
            medium3();
        }
    }//close medium4
   
   /**
    * First difficult math problem
    */
    public static void difficult1(){
        a=ranGen();
        b=notZeroGen();
        c=ranGen();
        
        realAnswer = a/b+c;
        for(timesAttempted = 0;timesAttempted<TIMES_ALLOWED;){
            System.out.println(a + " / " + b + " + " + c + " =");
            getAnswer();
            if(userAnswer == realAnswer){
                correct();
                break;
            }else{
                incorrect();
            }//close if/else
        }//close for loop
        harder = getHarder();
        if(harder = false){
            System.out.println("Try this instead:");
            medium4();
        }
    }//close difficult1
   
   /**
    * second difficult math problem
    */
    public static void difficult2(){
        a=ranGen();
        b=notZeroGen();
        c=ranGen();
        
        realAnswer = a/b-c;
        for(timesAttempted = 0;timesAttempted<TIMES_ALLOWED;){
            System.out.println(a + " / " + b + " - " + c + " =");
            getAnswer();
            if(userAnswer == realAnswer){
                correct();
                break;
            }else{
                incorrect();
            }//close if/else
        }//close for loop
        harder = getHarder();
        if(harder = false){
            System.out.println("Try this instead:");
            difficult1();
        }
    }//close difficult2
   
    /** 
     * Third difficult math problem
     */ 
    public static void difficult3(){
        a=ranGen();
        b=ranGen();
        c=notZeroGen();
        
        realAnswer = a*b/c;
        for(timesAttempted = 0;timesAttempted<TIMES_ALLOWED;){
            System.out.println(a + " * " + b + " / " + c + " =");
            getAnswer();
            if(userAnswer == realAnswer){
                correct();
                break;
            }else{
                incorrect();
            }//close if/else
        }//close for loop
        harder = getHarder();
        if (harder = false){
            System.out.println("Try this instead:");
            difficult2();
        }
    }//close difficult2
    
    /**
     * Forth difficult math problem
     */
    public static void difficult4(){
        a=ranGen();
        b=notZeroGen();
        c=notZeroGen();
        
        realAnswer = a/b/c;
        for(timesAttempted = 0;timesAttempted<TIMES_ALLOWED;){
            System.out.println(a + " / " + b + " / " + c + " =");
            getAnswer();
            if(userAnswer == realAnswer){
                correct();
                break;
            }else{
                incorrect();
            }//close if/else
        }//close for loop
        harder = getHarder();
        if (harder=false){
            System.out.println("Try this instead:");
            difficult3();
        }
    }//close difficult2
      
}//close class MathQuiz
