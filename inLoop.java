//take a input run loop statment
import java.util.Scanner;
class inLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        do{
            System.out.print("Enter any Number : ");
            number =  sc.nextInt();
            System.out.print("Here is your Numer = ");
            System.out.println(number);
        }while(number >= 0);


        // if you press negative number then show stt..
        System.out.print("THE NUMBER!");
    }
}