// print name using function
import java.util.*;
class printnamefunc{
    // function
    public static void printName(String name){
        System.out.println(name);
        return;
    }

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        
        printName("Welcome..." + name);
    }
}