// Mini project
import java.util.Scanner;

class miniProject{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do{
            System.out.print("Guess any Number (1 - 100) = ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber){
                System.out.println("WOOHOO!.... CORRECT NUMBER!");
                break;
            }else if(userNumber > myNumber){
                System.out.println("you number is too large!");
            }else{
                System.out.println("you number is too samll!");
            }
        }while(userNumber >= 0);

        System.out.println("My number was...!");
        System.out.print(myNumber);
    }
}



//search in youtube
// Java Tutorial for Beginners | Learn Java in 2 Hours