import java.util.Scanner;

class ifelsestatement{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num; 
        System.out.print("Enter any number : ");
        num = input.nextInt();

        // if else
        if(num > 0 ){
            System.out.print("Positive Number");
        }else if(num < 0 ){
            System.out.print("Nagetive Number");
        }else{
            System.out.print("Zero");
        }
    }
}