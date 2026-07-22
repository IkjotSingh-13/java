public class Super {
    // visit person.java where person.java is the parent class
    
    public static void main(String[] args){

        // super = Referes to parent class ( subclass <-superclass) used in constructors and method overriding
                //    calls the parent constructor to initialize attributes

                person person1 = new person("Ikjot", "Singh");

                person1.showName();
    }
}
