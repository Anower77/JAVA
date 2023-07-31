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