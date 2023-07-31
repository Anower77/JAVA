// package beginnerjava.beginnerjava;

import java.util.Scanner;


public class assignment3 {
    public static void main(String[] args) {
//        Variable Declaration
    int id,price;
    String title,description,category;
//    Input the values from the users

//    For ID
    Scanner idIn = new Scanner(System.in);
        System.out.print("Enter the id : ");
        id = idIn.nextInt();
//     For TIltle
    Scanner titleIn = new Scanner(System.in);
        System.out.print("Enter the title : ");
        title = titleIn.nextLine();
//    For Price
    Scanner priceIn = new Scanner(System.in);
        System.out.print("Enter the price(USD) : ");
       price = priceIn.nextInt();
//   For Description
    Scanner descriptionIn = new Scanner(System.in);
        System.out.print("Enter the description : ");
        description = descriptionIn.nextLine();
//    For Category
    Scanner categoryIn = new Scanner(System.in);
        System.out.print("Enter the category : ");
        category = categoryIn.nextLine();
      
//      Print the values
        System.out.println("\n\n"+"The value input by the users are given below : ");
        System.out.println("================================================");
        System.out.println("id : "+id);
        System.out.println("title : "+title);
        System.out.println("price(USD) : "+price);
        System.out.println("description : "+description);
        System.out.println("category : "+category);
    }
}