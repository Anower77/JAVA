import java.util.Scanner;
class Assignment5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age;
        System.out.print("Enter you age : ");
        age = input.nextInt();
        System.out.print("your age : " + age);

        // if statement
        if(age > 18){
            System.out.print(" you are voter and you can vote!");
        }else if(age < 18){
            System.out.print(" you are under 18, you can't vote");
        }else{
            System.out.print(" Invalid Ages!");
        }
        
    }
}