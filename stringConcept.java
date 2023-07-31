import java.util.Scanner;

public class stringConcept{

    public static void main(String[] args){

        // input keywords declaration
        Scanner input = new Scanner(System.in);
        // variable declaration
        String name;
        System.out.print("Enter your name : ");//optional sta!
        name = input.nextLine();

        System.out.print("Okay! Welcome, " + name);
        
    }
}