// import files
import java.util.Scanner;


public class input{

    public static void main(String[] args){
        // input keywords
        Scanner inputs = new Scanner(System.in);
        int number;

        // show number statement
        System.out.print("Enter integers number : ");
        number = inputs.nextInt();

        System.out.println("Number = " + number);
    }
}