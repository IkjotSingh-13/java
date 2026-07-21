public class Static{
    // visit friend.java
        public static void main(String[] args){

    //   static = makes a variable or method belong to the class rather than to any
    //            specific object. commonly used for utility methods or shared resources.
       
    friend friend1 = new friend("Ikjot");
    friend friend2 = new friend("Manmohit");

    System.out.println(friend1.name);
    // System.out.println(friend.numOfFriends);  wont work
    System.out.println(friend1.numOfFriends);   // both give one because each object has a copy of numoffriends which is 0 
    System.out.println(friend2.numOfFriends);
  
// below gives ans as 2 2 2 becuse the variable is static 

    System.out.println(friend1.number);
    System.out.println(friend2.number);
    System.out.println(friend.number);  // best and prefered way 
    }
}