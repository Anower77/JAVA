// print name using function
import java.util.*;
class printnamefunc{
    // function
    public static void printFactorial(int n){
        if(n < 0){
            System.out.println("Invalid Number!");
            return;
        }
        int factorial = 1;

        for (int i = n; i >= 1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();

        System.out.print("total factorial =  ");
        printFactorial(n);
    }
}