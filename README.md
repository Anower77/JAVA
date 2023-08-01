### Basic JAVA
---

### String Input


```java
import java.util.Scanner;

public class stringConcept{

    public static void main(String[] args){

        // input keywords declaration
        Scanner input = new Scanner(System.in);
        // variable declaration
        String name;
        System.out.print("Enter your name : ");//optional sta!
        name = input.nextLine();

        System.out.print("Okay! Welcome, " + name);
        
    }
}


```


### Sub-String
___
```java

class substring{
    public static void main(String[] args){

        String name = "Anower and Hossain";
        
        System.out.println(name.substring(7, 11));
    }
}

```

### Input
___
```java
// import files
import java.util.Scanner;


public class input{

    public static void main(String[] args){
        // input keywords
        Scanner inputs = new Scanner(System.in);
        int number;

        // show number statement
        System.out.print("Enter integers number : ");
        number = inputs.nextInt();

        System.out.println("Number = " + number);
    }
}

```

### Function
___
```java
// method and function
class function{
    
    // function-1
    public static void printJava(){
        System.out.println("Java==java");
    }

    // function-2
    public static void prnitName(String name){
        System.out.println(name);
    }

    // function-3
    public static void printSum(int a, int b){
        int sum = a + b;
        System.out.println("Addition = " +sum);
    }
    public static void main(String[] args){

        // function-1 call
        printJava();
        printJava();
        printJava();
        // function-2
        prnitName("Anwoer hossain");
        prnitName("Mahamudul Islam");
        prnitName("Shahadat hossain");
        // function=3
        printSum(10, 20);
        printSum(20, 20);
        printSum(40, 50);

    }
}
```


### Exception
___
```java
class exception{
    public static void main(String[] args) {
        // Try - catch  Exception Handling 

        int marks[] = {97, 98, 92};
        
        try{
           System.out.println(marks[5]);
        }catch(Exception exception){
            // do somethind after catching
        }

        System.out.println("The name is anower");
    }
}

```

### Loop (For, While, Do-While)
___
```java
class loop{
    public static void main(String[] args) {
        // looop statment -- for, while, do-while
        
        // for loop
        for(int i = 100; i >= 1; i--){
            System.out.println(i);
        }


        //while loop
        int j = 100;
        while(j >= 1){
            System.out.println(j);
            j--;
        }


        //do-while
        int k = 100;
        do{
            System.out.println(k);
            k--;
        }while(k >= 1);

    }
}
```

### In-Loop
___
```java
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

```

### Conditional
___
```java
class conditional{

    public static void main(String[] args){

        boolean isSunUp = false;
        if(isSunUp == true)
            System.out.println("day");
        else
            System.out.println("night");
    }
}
```

### Prime Function
___
```java
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

```

### Repleace
___
```java
class repleace{

    public static void main(String[] args){

        String name = "Anower";
        String name2 = name.replace('e', 'E');
        System.out.println(name2);
        System.out.print(name);
    }
}

```

### Summation Function
___
```java
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
```

### Switch
___
```java
class switch1{

    public static void main(String[] args) {
        // conditional statment -- switch
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Sat");
                break;
            case 2:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Mon - wed");
            
        }
    }
}
```

### Triangle
___
```java
import java.util.Scanner;
class Triangle{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double base, height, area;

        System.out.print("Enter base : ");
        base = input.nextDouble();
        
        System.out.print("Enter height : ");
        height = input.nextDouble();

        //triangle formula
        area = (0.5)* base * height;

        System.out.println("Area = " + area);

    }
}

```

### Factorial 
___
```java
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

```

### Array
___
```java
import java.util.Arrays;

class array2d{

    public static void main(String[] args){
        int[][] finalMarks = {{90, 89, 70}, {90, 99, 80}};
        System.out.println(finalMarks[0][1]);
    }
}

```


### Circle
___
```java
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

```

### Casting
___
```java
class array2d{

    public static void main(String[] args){
        double price  = 100.00;
        double totalPrice = price + 18;

        System.out.println(totalPrice);

        // wrong methods
        int price1 = 100;
        int totalPrice1 = price1 + (int)18.00;
 
        System.out.println(totalPrice1);

    }
}
```

### IF-else
___
```java
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
```

### Double Concept
___
```java
class array2d{

    public static void main(String[] args){
        double price  = 100.00;
        double totalPrice = price + 18;

        System.out.println(totalPrice);

        // wrong methods
        int price1 = 100;
        int totalPrice1 = price1 + (int)18.00;
 
        System.out.println(totalPrice1);

    }
}
```

### Circle Area
___
```java
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
```

### Assignment-01
___
```java
class assignment {

    public static void main(String[] args){

        System.out.println("ID: 12093");
        System.out.println("Description: something like that!");
        System.out.println("Laptop: lanovo");
        System.out.println("Price: 2394K");
    }
}
```

### Assignment-02
___
```java
class assignment2{

    public static void main(String[] args){


        int a = 29393;
        double d = 23.2;
        short s = 329;
        int i = 5;               
        float f = 5.99f;    
        char c = 'D';         
        boolean b = true;      
        System.out.println("double = " + d);
        System.out.println("short = " + s);
        System.out.println("int = " + i);
        System.out.println("float = " + f);
        System.out.println("char = " + c);
        System.out.println("boolean = " + b);
    }
}
```

### Assignment-03
___
```java
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
```

### Assignment-04
___
```java
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
```

### Assignment-05
___
```java
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
```

