public class constructors {
    // visit student.java
    public static void main(String[] args){
        // constructors = A speacial method to initialize objects you can pass arguments to a contructor
       //                 and set up intial values 
       
       student student1 = new student("Ikjot singh",19,9.2);
       student student2 = new student("Manmohit",17,9.7);

       System.out.println(student1.name);
       System.out.println(student2.name);

      
    }
}
