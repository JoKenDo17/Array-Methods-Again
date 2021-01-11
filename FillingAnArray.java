/**
 * Write a description of class FillingAnArray here.
 *
 * @author (Joey Dolan)
 * @version (1.0)
 */

import java.util.Scanner;

public class FillingAnArray
{
    static void clearScreen() {
        System.out.print('\u000C');
    }
    
    public static void main(String[] args) {
        
        int i = 0;
        
        //Here you initialize the booleans to let you repeat tasks
        boolean playAgain = true;
        boolean fillAnElement = true;
        
        //Here you initialize the length of the array
        int number = 5;
        String[] myStringArray = {"0", "1", "2", "3", "4"};
        
        //Here you make a variable so the user can choose an element
        int elementNumber;
        
        //Here you intialize the scanner
        Scanner myScanner = newScanner(System.in);
        
        ///Here, you initialize all of the methods that will be used in the program.
        
        //Here is the first method
        public static int changeelement(int i){
            while (fillAnElement) {
                System.out.print("Which element would you like to replace? Type a number between 1 and 5.");
                elementNumber = myScanner.nextInt();
                int printNumber = elementNumber + 1; //That adds a one to the index
                
                System.out.print("Enter a new value for the element " + alementNumber + ": ");
                myStringArray[elementNumber -1] = myScanner.next();
                
                System.out.print("Type true if you want to replace one or more elements into the array.");
                fillAnElement = myScanner.nextBoolean();
            }
            
        //Here is the second method
        
        public static int inputstrings(int i){
            intcount = i + 1;
            System.out.print("Give the value for the string in position " + count + ": ");
            myStringArray[i] = myScanner.next();
        
    
        //Here is the third method
        
        public static int loopprint(int i){
            System.out.println("Here are the values in the array.");
            for (int i = 0; i < number; i++) {
                int numberPlusOne = i + 1;
                System.out.println("The string in position " + numberPlusOne + " is " + myStringArray[i] + ".");
            }
        }
        
        //Here is the fourth method
        
        public static int valuechange(int i){
            
           System.out.print("Type true if you'd like to replace one or more elements inside the array. ");
           fillAnElement = myScanner.nextBoolean();
        }
    }

        do{
            clearScreen();
            
            System.out.println("There is an array with a place for five strings.");
            
            //Prompting the user to input the strings for the array
            
            inputstrings();
            
            //Uses a for loop to print out elements inside of the array
            
            loopprint();
            
            //Prompts the user for a choice of changing the value of an element in the array.
            
            valuechange();
            
            //Gives the user a chance to change an element value by prompting the element number placement and the string value
            
            changeelement();
            
        }
            //Printing the values in an array
            System.out.println("Here are the values in the array");
            
            for (int i = 0; i < number; i+++) {
                int numberPlusOne = i + 1;
                System.out.println("The string in position " + numberPlusOne + " is " + myStringArray[i] + ".");
            }

        System.out.print("Do you want to start the process again? Type true or false: ");
playAgain = myScanner.nextBoolean();
} while (playAgain); ///If the user entered true, the program loops
           