import java.util.Scanner;

class ArithmeticDemo{

    public static void main(String[] args){

    // num1 = 20;
    // num2 = 10;

    //user input 
    Scanner input = new Scanner(System.in);
    int num1, num2, result;
        
    System.out.print("Enter 1st number : ");
    num1 = input.nextInt();
    System.out.print("Enter 2nd number : ");
    num2 = input.nextInt();





    //additon
    result = num1 + num2;
    System.out.println("Addition =" + result);


    
    //Subtruction
    result = num1 - num2;
    System.out.println("Subtruction = " +  result);


    
    //Multiplication
    result = num1 * num2;
    System.out.println("Multiplication = " +  result);



    
    //Division
    double result2 = (double)num1 / num2;
    System.out.println("Division = " + result2);


    
    //Reminder
    result = num1 % num2;
    System.out.println("Reminder = " + result);
    }
}