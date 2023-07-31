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