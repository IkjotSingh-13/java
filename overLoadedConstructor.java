public class overLoadedConstructor {
    // visit user.java

    public static void main(String[] args){
        // overloaded constructors = Allow a class to have multiple constructors with different parameters lists
        //                           enables objects to be initialized in various ways

        user user1 = new user("ikjot");

        System.out.println(user1.userName);
         System.out.println(user1.email);
         System.out.println(user1.age);

     user user2 = new user("Manmohit","kajukatli@gmail.com");
       System.out.println(user2.userName);
         System.out.println(user2.email);
         System.out.println(user2.age);

         user user3 = new user();       // no arguments
           System.out.println(user3.userName);
         System.out.println(user3.email);
         System.out.println(user3.age);
    }
}
