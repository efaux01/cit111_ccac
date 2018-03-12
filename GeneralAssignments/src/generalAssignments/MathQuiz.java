/*
 * A program of a basic math quiz that generates equations with random numbers 
 * and gets harder or easier based on correct. It also terminates after a 
 * number of equations.
 */
package generalAssignments;
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
    static final int UPPER_LIMIT = 6;
    static final int TOTAL_PROBLEMS = 25;
    static int answeredProblems = 0;
    static int questionNumber = 1;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Math Quiz!");
        System.out.println("Please answer the following questions:");
        
       control();
    }//close main
    
    /**
     * control which equation is accessed each time
     */
    public static void control(){
        if (questionNumber == 0){questionNumber = 1;}
        System.out.println("questionNumber: " + questionNumber);
        switch(questionNumber){
            case 1:
                easy1();
            case 2:
                easy2();
            case 3:
                easy3();
            case 4:
                easy4();
            case 5:
                medium1();
            case 6:
                medium2();
            case 7:
                medium3();
            case 8:
                medium4();
            case 9:
                difficult1();
            case 10:
                difficult2();
            case 11:
                difficult3();
            case 12:
                difficult4();
            case 13:
                answeredProblems = TOTAL_PROBLEMS;
                programEnd();
        }//close switch
    }//close control
    
    /**
     * Generate a random number
     * @return a random number
     */
    public static int ranGen(){
        Random randGenerator = new Random();
        int number = randGenerator.nextInt(UPPER_LIMIT) ;
        return number;
    }// close ranGen
    
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
    }//close incorrect
    
    /**
     * gets an answer from the user. Advances the timesAttempted count
     */
    public static void getAnswer(){
        Scanner scanAnswer = new Scanner(System.in);
        userAnswer = scanAnswer.nextDouble();
        timesAttempted ++;
    }//close get answer
    
    /**
     * decide if 
     * @return boolean harder 
     */
    public static boolean getHarder(){
        final int JUST_ONCE = 1;
        
        if(timesAttempted == JUST_ONCE){
            harder =  true;
        }else {
            harder = false;
        }//close if/else
        return harder;
    }//close getHarder
    
    /**
     * decides if questions should get easier or harder
     */
    public static void easyOrHard(){
        harder = getHarder();
        if(harder == true){
            questionNumber ++;
        }else{
            questionNumber --;
        }//close if/else
        control();
    }//close easyOrHard
    
    /**
     * set 3 variables to random integers
     */
    public static void setVariables(){
        a = ranGen();
        b = ranGen();
        c = ranGen();
    }//close setVariables
    
    /**
     * set 3 variables to random integers when b is a divisor
     */
    public static void setDivisorVariables(){
        a = ranGen();
        b = notZeroGen();
        c = ranGen();
    }//close setDivisorVaribales
    
    /**
     * collects an answer and decides if it is correct. Repeats allowed number 
     * of times if answer is incorrect.
     */
    public static void answerCollection(){
        for(timesAttempted = 0;timesAttempted<TIMES_ALLOWED;){
            getAnswer();
            if(userAnswer == realAnswer){
                correct();
                break;
            }else{
                incorrect();
            }//close if/else
        }//close for loop
        programEnd();
    }// close answerCollection 
    
    /**
     * ends program if user answered a specific number of questions
     */
    public static void programEnd(){
        if(answeredProblems == TOTAL_PROBLEMS){
            System.out.println("Congradulations! You have reached the end of Math Quiz");
            System.exit(0);
        }else{
            answeredProblems = answeredProblems + 1;
        }//close if/else
    }//close programEnd
    
    /**
     * first easy math problem
     */
    public static void easy1(){
        while(harder == false){
            setVariables();
        
            realAnswer = a+b;
            System.out.println(a + " + " + b + " =");
            answerCollection();
            
            harder = getHarder();
            answeredProblems ++;
        }//close while loop
    }//close easy1
    
    /**
     * second easy math problem
     */
    public static void easy2(){
        setVariables();
        
        realAnswer = a-b;
        System.out.println(a + " - " + b + " =");
        answerCollection();
        
        easyOrHard();
    }//close easy2
  
    /**
     * third easy math problem
     */
    public static void easy3(){
        setVariables();
        
        realAnswer = a*b; 
        System.out.println(a + " x " + b + " =");
        answerCollection();
        
        easyOrHard();
    }//close easy3
    
    /**
     * forth easy math problem
     */
    public static void easy4(){
        setDivisorVariables();
        
        realAnswer = a%b; 
        System.out.println(a + " / " + b + " =");
        answerCollection();
        
        easyOrHard();
    }//close easy4
    
    /**
     * First medium math problem
     */
    public static void medium1(){
        setVariables();
        
        realAnswer = a+b-c;
        System.out.println(a + " + " + b + " - " + c + " =");
        answerCollection();
        
        easyOrHard();
    }//close medium1
    
   /** 
    * second medium math problem
    */
    public static void medium2(){
        setVariables();
        
        realAnswer = a+b*c;
        System.out.println(a + " + " + b + " x " + c + " =");
        answerCollection();
        
        easyOrHard();
    }//close medium2
   
   /**
    * Third medium math problem
    */
    public static void medium3(){
        setVariables();
        
        realAnswer = a*b-c;
        System.out.println(a + " x " + b + " - " + c + " =");
        answerCollection();
        
        easyOrHard();
    }//close medium3
   
   /**
    * Forth medium math problem
    */
    public static void medium4(){
        setVariables();
        
        realAnswer = a*b*c;
        System.out.println(a + " x " + b + " x " + c + " =");
        answerCollection();
        
        easyOrHard();
    }//close medium4
   
   /**
    * First difficult math problem
    */
    public static void difficult1(){
        setDivisorVariables();
        
        realAnswer = a%b+c;
        System.out.println(a + " / " + b + " + " + c + " =");
        answerCollection();
        
        easyOrHard();
    }//close difficult1
   
   /**
    * second difficult math problem
    */
    public static void difficult2(){
        setDivisorVariables();
        
        realAnswer = a%b-c;
        System.out.println(a + " / " + b + " - " + c + " =");
        answerCollection();
        
        easyOrHard();
    }//close difficult2
   
    /** 
     * Third difficult math problem
     */ 
    public static void difficult3(){
        setDivisorVariables();
        
        realAnswer = a*c%b;
        System.out.println(a + " * " + c + " / " + b + " =");
        answerCollection();
       
        easyOrHard();
    }//close difficult2
    
    /**
     * Forth difficult math problem
     */
    public static void difficult4(){
        a=ranGen();
        b=notZeroGen();
        c=notZeroGen();
        
        realAnswer = a%b%c;
        System.out.println(a + " / " + b + " / " + c + " =");
        answerCollection();
        
        easyOrHard();
    }//close difficult2      
}//close class MathQuiz