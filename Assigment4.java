import java.util.Scanner;
// Create a program to calculate installment amount for per month
public class Assignment4 {
  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {
      int phonePrice = 1800; // 1800 euros
      int numberOfInstallment, installmentPerMonth;

      System.out.println("Number of installments? ");
      // get number of installments from user
      System.out.print("Enter numberOfInstallment : ");
      numberOfInstallment = input.nextInt();
    
      installmentPerMonth = phonePrice / numberOfInstallment;

      // calculate  installment amount for per month
    

        System.out.println("Monthly installment Amount: "+installmentPerMonth + " euros");
    } 

  }
}