/*
 * This is a program to convert measurements commonly used in baking/cooking.
 * The program is set up in a way that utilizes no class variables.
 */
package generalAssignments;
    import java.util.Scanner;
/**
 *
 * @author eliza
 */
public class BakingConverter {
    public static void main(String args[]){
        System.out.println("Welcome to the Bakers' Converter.");
        originalMenu();
    }//close main
    
    /**
     * First menu where user chooses what kind of units to convert
     */
    public static void originalMenu(){
        int unitType = 0;
        
        while(unitType !=1 && unitType != 2 && unitType !=3){
            System.out.println("What kind of unit are you trying to convert?");
            System.out.println("1.Temperature \n2.Weight \n3.Volume");
            unitType = getInt();
        }
        switch(unitType){
            case 1:
                temperature();
                break;
            case 2:
                weight();
                break;
            case 3:
                volume();
        } 
    }//close originalMenu
                
    /**
     * menu for user to choose between starting with Fahrenheit or Celsius
     */
    public static void temperature(){
        int degreeChoice = 0;
        
        System.out.println("Would you like to start with:");
        System.out.println("1.Fahrenheit   OR \n2.Celsius");
        while(degreeChoice!=1 && degreeChoice!=2){
            degreeChoice = getInt();
        }
        switch(degreeChoice){
            case 1:
                fahrenheit();
                break;
            case 2:
                celsius();
        }
    }//close teperature
    
    /**
     * Converts weight measurements
     */
    public static void weight(){
        int weightType = 0;
        int weightEnd = 0;
        double toOz = 1;
        double inOz = 0;
        String originalType = "initialize";
        String convertedType = "initialize";
        double convertFactor = 0;
        double originalWeight;
        double convertedWeight;
                
        while(weightType!=1 && weightType!=2 && weightType!=3){
            System.out.println("What is the original unit to be converted from?");
            System.out.println("1.oz \n2.lbs \n3.grams");
            weightType = getInt();
        }
        switch(weightType){
            case 1:
                originalType = "oz";
                break;
            case 2:
                originalType = "lbs";
                toOz = 16;
                break;
            case 3:
                originalType = "grams";
                toOz = 0.03527;
        }
        
        System.out.println("What is the original weight in " + originalType);
        originalWeight = getDouble();
        inOz = originalWeight*toOz;
        
        while(weightEnd!=1 && weightEnd!=2 && weightEnd!=3){
            System.out.println("What unit are you converting to?");
            System.out.println("1.oz \n2.lbs \n3.grams");
            weightEnd = getInt();
        }
        switch(weightEnd){
            case 1:
                convertedType = "oz";
                endDisplay(originalWeight,inOz,originalType,convertedType);
            case 2:
                convertFactor = 0.0625;
                convertedType = "lbs";
                break;
            case 3:
                convertFactor = 28.3495;
                convertedType = "grams";
        }
        convertedWeight = converter(originalWeight,convertFactor);
        endDisplay(originalWeight,convertedWeight,originalType,convertedType);
    }//close weight
    
    /**
     * converts volume measurements
     */
    public static void volume(){
         int startType = 0;
         int endType = 0;
        double originalMeasure;
        double convertedMeasure;
        String originalUnit = "initialize";
        String convertedUnit = "initialize";
        double toCups = 1;
        double inCups = 0;
        double fromCups = 1;
        
        while(startType>9 && startType <1){
            System.out.println("What is the original unit to be converted from?");
            System.out.println("1.Teaspoons \n2.Tablespoons \n3.Cups \n4.Fluid Ounces"
                + "\n5.Pints \n6.Quarts \n7.Gallons \n8.Milliliters \n9.Liters");
            startType = getInt();
        }
        
        switch(startType){
            case 1:
                originalUnit = "tsp";
                toCups = 48;
                break;
            case 2:
                originalUnit = "tbsp";
                toCups = 16;
                break;
            case 3:
                originalUnit = "cups";
                break;
            case 4:
                originalUnit = "oz";
                toCups = 8;
                break;
            case 5:
                originalUnit = "pt";
                toCups = 0.5;
                break;
            case 6:
                originalUnit = "qt";
                toCups = .25;
                break;
            case 7:
                originalUnit = "gal";
                toCups = 0.0625;
                break;
            case 8:
                originalUnit = "ml";
                toCups = 236.6;
            case 9:
                originalUnit = "l";
                toCups = 0.2366;
        }
        System.out.println("What is the original volume in " + originalUnit + " ?");
        originalMeasure = getDouble();
        
        if(originalUnit=="cups"){
            inCups = originalMeasure;
        }else{
            inCups =converter(originalMeasure,toCups);
        }
        while(endType>9 && endType <1){
            System.out.println("What would you like to convert to?");
            System.out.println("1.Teaspoons \n2.Tablespoons \n3.Cups \n4.Fluid Ounces"
                + "\n5.Pints \n6.Quarts \n7.Gallons \n8.Milliliters \n9.Liters");
            endType = getInt();
    }
        switch(endType){
            case 1:
                convertedUnit = "tsp";
                fromCups = 0.0208;
                break;
            case 2:
                convertedUnit = "tbsp";
                fromCups = 0.0625;
                break;
            case 3:
                convertedUnit = "cups";
                endDisplay(originalMeasure,inCups,originalUnit,convertedUnit);
                break;
            case 4:
                convertedUnit = "oz";
                fromCups = 0.125;
                break;
            case 5:
                convertedUnit = "pt";
                fromCups = 2;
                break;
            case 6:
                convertedUnit = "qt";
                fromCups = 4;
                break;
            case 7:
                convertedUnit = "gal";
                fromCups = 16;
                break;
            case 8:
                convertedUnit = "ml";
                fromCups = 0.0042;
                break;
            case 9:
                convertedUnit = "l";
                fromCups = 4.2265;
        }
        convertedMeasure=converter(inCups,fromCups);
        endDisplay(originalMeasure,convertedMeasure,originalUnit,convertedUnit);
    }//close volume
    
    /**
     * converts Fahrenheit to Celsius
     */
    public static void fahrenheit(){
        String originalDegree = "Degrees Fahrenheit";
        String convertedDegree = "Degrees Celsius";
        double degreesF=0;
        double degreesC;
        
        System.out.println("What is the original temperature in degrees Fahrenheit?");
        degreesF = getDouble();
        degreesC = (degreesF-32)*5/9;
        
        endDisplay(degreesF,degreesC,originalDegree,convertedDegree);   
    }//close fahrenheit
    
    /**
     * converts Celsius to Fahrenheit
     */
    public static void celsius(){
        String original = "Degrees Celsius";
        String converted = "Degrees Fahrenheit";
        double celsius = 0;
        double fahrenheit;
        
        System.out.println("What is the original temperature in degrees Celsius?");
        celsius = getDouble();
        fahrenheit = celsius*9/5+32;
        
        endDisplay(celsius,fahrenheit,original,converted);
    }//close celsius
    
    /**
     * does the actual math of converting one unit to another
     * @param original the value of the original unit
     * @param conversionFactor factor to be multiplied by to change units
     * @return value converted from one unit to another
     */
    public static double converter(double original, double conversionFactor){
        double converted = original * conversionFactor;
        return converted;
    }
    
    /**
     * gets an integer from the user
     * @return integer
     */
    public static int getInt(){
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        return number;
    }//close getNumber
    
    /**
     * gets a double from the user
     * @return double
     */
    public static double getDouble(){
        Scanner moreInput = new Scanner(System.in);
        double value = moreInput.nextDouble();
        return value;
    }//close getDouble
    
    /**
     * The final thing the user sees with all the original and converted information
     * @param originalValue value of original unit
     * @param convertedValue value of converted unit
     * @param originalUnit name of original unit
     * @param convertedUnit  name of converted unit
     */
    public static void endDisplay(double originalValue, double convertedValue, 
            String originalUnit, String convertedUnit){
        System.out.println(originalValue + " " + originalUnit + " is equal to " 
                + convertedValue + " " + convertedUnit);
        
        System.out.println("Would you like to: \n1.Convert another measurement "
                + "\n2.End program");
    }
}//close BakingConverter
