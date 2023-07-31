// calculate sum
import java.util.*;
class sumfunc{
    public static int calculateSum(int a, int b){
        int sum = a + b;
        System.out.print(sum);
        return 1;
    }
    // main
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = sc.nextInt();
        System.out.print("Enter b value : ");
        int b = sc.nextInt();
        System.out.print("Summation : ");
        calculateSum(a, b);
    }
}