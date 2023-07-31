import java.util.Scanner;
class circleArea{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double area, radius, pi;
        pi = 3.1416;
        System.out.print("Enter radius : ");
        radius = input.nextDouble();

        // circle formula
        area = pi * (radius * radius); 
        System.out.println("Circle area = " + area);
    }
}